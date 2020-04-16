package com.javbus.data.base.movie;

import com.javbus.data.base.movie.domain.MovieDto;
import com.javbus.data.base.movie.domain.MovieEntity;
import com.javbus.data.jpa.MovieDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/15 23:14
 * @Description:
 */
@Component
@Transactional(rollbackFor = Exception.class)
public class MovieComponent {
    @Autowired
    private MovieService movieService;
    @Autowired
    private MovieDao movieDao;

    public List<MovieEntity> test() {
        List<MovieEntity> entities = movieService.list();
        return entities;
    }

    public MovieEntity add(MovieDto dto) {
        MovieEntity entity = new MovieEntity();
        BeanUtils.copyProperties(dto,entity);
        return movieDao.save(entity);
    }
}
