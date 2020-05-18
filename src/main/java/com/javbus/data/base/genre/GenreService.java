package com.javbus.data.base.genre;

import com.javbus.data.base.old.GenreOldDao;
import com.javbus.data.base.old.GenreOldEntity;
import com.javbus.data.base.old.QGenreOldEntity;
import com.javbus.data.jpa.GenreDao;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wuliangyu
 * @Date: 2020/5/19 0:17
 * @Description:
 */
@Service
@Slf4j
public class GenreService {

    @Autowired
    private GenreOldDao genreOldDao;

    @Autowired
    private JPAQueryFactory jpaQueryFactory;

    @Autowired
    private GenreDao genreDao;

    public long oldDataToNew(){
        QGenreOldEntity genreOldEntity = QGenreOldEntity.genreOldEntity;

        //获取总数
        long total = genreOldDao.count();

        long limit = 100L;
        long offset = 0L;
        while (offset < total) {
            List<GenreEntity> genreEntities = new ArrayList<>();
            List<GenreOldEntity> genreOldEntities =
                    jpaQueryFactory
                            .selectFrom(genreOldEntity)
                            .limit(limit)
                            .offset(offset)
                            .orderBy(genreOldEntity.genre_id.asc())
                            .fetch();

            genreOldEntities.stream().forEach(one -> {
                GenreEntity entity = new GenreEntity();
                entity.setGenreId(one.getGenre_id());
                entity.setJpaName(one.getGenre_name());
                entity.setEngName(one.getGenre_name_ENG());
                genreEntities.add(entity);
                log.info(entity.toString());
                log.info("第" + genreOldEntities.indexOf(one) + "个");
            });
            genreDao.saveAll(genreEntities);
            offset = offset + limit;
        }
        return genreDao.count();
    }
}
