package com.javbus.data.jpa;

import com.javbus.data.base.genre.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * @author: wuliangyu
 * @Date: 2020/5/19 0:18
 * @Description:
 */
public interface GenreDao extends JpaRepository<GenreEntity, Long>, QuerydslPredicateExecutor<GenreEntity> {
}
