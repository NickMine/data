package com.javbus.data.jpa;

import com.javbus.data.base.actress.ActressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/22 0:36
 * @Description:
 */
public interface ActressDao extends JpaRepository<ActressEntity, Long>, QuerydslPredicateExecutor<ActressEntity> {
}
