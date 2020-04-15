package com.javbus.data.base.movie.domain;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/14 22:55
 * @Description:
 */
@Data
@Entity
@Table(name = "t_movie")
public class MovieEntity extends MovieBase {

}
