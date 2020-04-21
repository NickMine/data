package com.javbus.data.base.actress.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/22 0:31
 * @Description:
 */
@Data
@Entity
@Table(name = "t_actress")
public class ActressEntity extends ActressBase {
}
