package com.javbus.data.jpa;

import com.javbus.data.base.movie.domain.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/14 23:19
 * @Description:
 */
public interface MovieDao extends JpaRepository<MovieEntity, Long>, QuerydslPredicateExecutor<MovieEntity> {
}
