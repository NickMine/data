package com.javbus.data.base.movie;

import com.javbus.data.common.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/14 22:55
 * @Description:
 */
@Data
@Entity
@Table(name = "t_movie")
@NoArgsConstructor
public class MovieEntity extends BaseEntity {

    @ApiModelProperty("电影id")
    @Column(columnDefinition = "varchar(30) Comment '电影id'")
    private String movieId;

    @ApiModelProperty("电影名")
    @Column(columnDefinition = "varchar(200) Comment '电影名'")
    private String movieName;

    @ApiModelProperty("上映时间")
    @Column(columnDefinition = "date Comment '上映时间'")
    private Date movieUploadDate;

    @ApiModelProperty("电影时长")
    @Column(columnDefinition = "varchar(30) Comment '电影时长'")
    private String movieDuration;

    @ApiModelProperty("电影系列")
    @Column(columnDefinition = "varchar(30) Comment '电影系列'")
    private String movieSeries;

    @ApiModelProperty("电影编号")
    @Column(columnDefinition = "varchar(30) Comment '电影编号'")
    private String movieNumber;

    @ApiModelProperty("电影描述")
    @Column(columnDefinition = "text Comment '电影描述'")
    private String movieDescription;

    @ApiModelProperty("电影发行商")
    @Column(columnDefinition = "varchar(30) Comment '电影发行商'")
    private String moviePublisher;

}
