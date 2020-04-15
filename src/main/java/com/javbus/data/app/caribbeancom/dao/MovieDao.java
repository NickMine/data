package com.javbus.data.app.caribbeancom.dao;

import com.javbus.data.base.movie.domain.MovieEntity;
import com.javbus.data.base.movie.domain.QMovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/14 23:19
 * @Description:
 */
public interface MovieDao extends JpaRepository<MovieEntity, QMovieEntity>, QuerydslBinderCustomizer {
}
