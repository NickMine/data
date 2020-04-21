package com.javbus.data.base.old;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/21 20:06
 * @Description:
 */
@Data
@Entity
@Table(name = "movie")
public class MovieOldEntity implements Serializable {
    @Id
    @ApiModelProperty("电影id")
    @Column(columnDefinition = "varchar(30)")
    private int movieId;

    @ApiModelProperty("电影名")
    @Column(columnDefinition = "varchar(200)")
    private String movieName;

    @ApiModelProperty("上映时间")
    @Column(name = "movie_uploadDate", columnDefinition = "date")
    private Date movieUploadDate;

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
