package com.javbus.data.base.movie;

import com.javbus.data.base.movie.domain.MovieDto;
import com.javbus.data.base.movie.domain.MovieEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/15 23:14
 * @Description:
 */
@Component
public class MovieComponent {
    @Autowired
    private MovieService movieService;

    public List<MovieEntity> test() {
        List<MovieEntity> entities = movieService.list();
        return entities;
    }
}
