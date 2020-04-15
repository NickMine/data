package com.javbus.data.base.movie.domain;

import com.javbus.data.common.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/14 23:08
 * @Description:
 */
@Data
@MappedSuperclass
public class MovieBase extends BaseEntity {

    @ApiModelProperty("电影id")
    @Column(columnDefinition = "varchar(30)")
    private int movieId;

    @ApiModelProperty("电影名")
    @Column(columnDefinition = "varchar(30)")
    private String movieName;

    @ApiModelProperty("上映时间")
    @Column(columnDefinition = "date")
    private String movieUploadDate;

    @ApiModelProperty("电影时长")
    @Column(columnDefinition = "varchar(30)")
    private String movieDuration;

    @ApiModelProperty("电影系列")
    @Column(columnDefinition = "varchar(30)")
    private String movieSeries;

    @ApiModelProperty("电影编号")
    @Column(columnDefinition = "varchar(30)")
    private String movieNumber;

    @ApiModelProperty("电影描述")
    @Column(columnDefinition = "text")
    private String movieDescription;

    @ApiModelProperty("电影发行商")
    @Column(columnDefinition = "varchar(30)")
    private String moviePublisher;
}
