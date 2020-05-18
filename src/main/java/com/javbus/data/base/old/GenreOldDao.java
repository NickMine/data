package com.javbus.data.base.old;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * @Auther: wuliangyu
 * @Date: 2020/5/18 23:39
 * @Description:
 */
public interface GenreOldDao extends JpaRepository<GenreOldEntity, Long>, QuerydslPredicateExecutor<GenreOldEntity> {
}
