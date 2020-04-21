package com.javbus.data.base.movie;

import com.javbus.data.base.movie.domain.MovieEntity;
import com.javbus.data.base.movie.domain.QMovieEntity;
import com.javbus.data.base.old.MovieOldDao;
import com.javbus.data.base.old.MovieOldEntity;
import com.javbus.data.base.old.QMovieOldEntity;
import com.javbus.data.jpa.MovieDao;
import com.querydsl.core.QueryResults;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/15 22:54
 * @Description:
 */
@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class MovieService {

    @Autowired
    private MovieDao movieDao;

    @Autowired
    private MovieOldDao movieOldDao;

    @Autowired
    private JPAQueryFactory jpaQueryFactory;

    public List<MovieEntity> list() {
        return movieDao.findAll();
    }

    public QueryResults<MovieOldEntity> oldPage(long page, long size) {
        long limit = size;
        long offset = (page - 1) * size;
        QMovieOldEntity movieOld = QMovieOldEntity.movieOldEntity;
        QueryResults<MovieOldEntity> results =
                jpaQueryFactory
                        .selectFrom(movieOld)
                        .limit(limit)
                        .offset(offset)
                        .fetchResults();
        return results;
    }

    public long oldDataToNew() {
        QMovieEntity movie = QMovieEntity.movieEntity;
        QMovieOldEntity movieOld = QMovieOldEntity.movieOldEntity;

        //获取总数
        long total = movieOldDao.count();

        long limit = 200L;
        long offset = 0L;
        while (offset < total) {
            List<MovieOldEntity> movieOldEntities =
                    jpaQueryFactory
                            .selectFrom(movieOld)
                            .limit(limit)
                            .offset(offset)
                            .orderBy(movieOld.movieUploadDate.asc())
                            .fetch();

            movieOldEntities.stream().forEach(one -> {
                MovieEntity movieEntity = new MovieEntity();
                BeanUtils.copyProperties(one, movieEntity);
                movieEntity = movieDao.save(movieEntity);
                log.info(movieEntity.toString());
                log.info("第" + movieOldEntities.indexOf(one) + "个");
            });

            offset = offset + limit;
        }
        return movieDao.count();
    }
}
