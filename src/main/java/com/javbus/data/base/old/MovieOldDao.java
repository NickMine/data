package com.javbus.data.base.old;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/21 21:23
 * @Description:
 */
public interface MovieOldDao extends JpaRepository<MovieOldEntity, Long>, QuerydslPredicateExecutor<MovieOldEntity>
{
}
