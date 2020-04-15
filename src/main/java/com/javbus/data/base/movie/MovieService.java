package com.javbus.data.base.movie;

import com.javbus.data.base.movie.domain.MovieEntity;
import com.javbus.data.base.movie.domain.QMovieEntity;
import com.javbus.data.jpa.MovieDao;
import com.querydsl.core.types.dsl.BooleanExpression;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/15 22:54
 * @Description:
 */
@Service
@Slf4j
public class MovieService {

    @Autowired
    private MovieDao movieDao;

    public List<MovieEntity> list(){
        return movieDao.findAll();
    }
}
