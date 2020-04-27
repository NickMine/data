package com.javbus.data.base.old;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/27 20:15
 * @Description:
 */
@Data
@Entity
@Table(name = "actress")
public class ActressOldEntity {
    @Id
    @ApiModelProperty("搜索ID")
    @Column(columnDefinition = "int(30) Comment '搜索ID'")
    private int actress_id;         //搜索ID

    @ApiModelProperty("日文名")
    @Column(columnDefinition = "varchar(30) Comment '日文名'")
    private String actress_name_jpn;       //日文名

    @ApiModelProperty("中文名")
    @Column(columnDefinition = "varchar(30) Comment '中文名'")
    private String actress_name_chn;       //中文名

    @ApiModelProperty("英文名")
    @Column(columnDefinition = "varchar(30) Comment '英文名'")
    private String actress_name_eng;       //英文名

    @ApiModelProperty("出生日")
    @Column(columnDefinition = "date  Comment '出生日'")
    private Date actress_birthday;       //生日

    @ApiModelProperty("身高")
    @Column(columnDefinition = "varchar(30) Comment '身高'")
    private String actress_tall;      //身高

    @ApiModelProperty("三围")
    @Column(columnDefinition = "varchar(30) Comment '三围'")
    private String actress_sanwei;      //三围

    @ApiModelProperty("罩杯")
    @Column(columnDefinition = "varchar(30) Comment '罩杯'")
    private String actress_cup;      //罩杯

    @ApiModelProperty("血型")
    @Column(columnDefinition = "varchar(30) Comment '血型'")
    private String actress_blood;      //血型

    @ApiModelProperty("出生地址")
    @Column(columnDefinition = "varchar(300) Comment '出生地址'")
    private String actress_address;      //出生地址


    @ApiModelProperty("头像")
    @Column(columnDefinition = "varchar(30) Comment '头像'")
    private String actress_image;      //头像

}
