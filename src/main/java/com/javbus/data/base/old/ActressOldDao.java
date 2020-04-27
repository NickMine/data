package com.javbus.data.base.old;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/27 20:20
 * @Description:
 */
public interface ActressOldDao extends JpaRepository<ActressOldEntity, Long>, QuerydslPredicateExecutor<ActressOldEntity> {
}
