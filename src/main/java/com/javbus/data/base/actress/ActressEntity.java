package com.javbus.data.base.actress;

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
 * @Date: 2020/4/22 0:31
 * @Description:
 */
@Entity
@Data
@Table(name = "t_actress")
@NoArgsConstructor
public class ActressEntity extends BaseEntity {
    @ApiModelProperty("搜索ID")
    @Column(columnDefinition = "varchar(30) Comment '搜索ID'")
    private String actressId;

    @ApiModelProperty("日文名")
    @Column(columnDefinition = "varchar(30) Comment '日文名'")
    private String jpnName;

    @ApiModelProperty("中文名")
    @Column(columnDefinition = "varchar(30) Comment '中文名'")
    private String chnName;

    @ApiModelProperty("英文名")
    @Column(columnDefinition = "varchar(30) Comment '英文名'")
    private String engName;

    @ApiModelProperty("出生日")
    @Column(columnDefinition = "date  Comment '出生日'")
    private Date birthday;

    @ApiModelProperty("身高")
    @Column(columnDefinition = "varchar(30) Comment '身高'")
    private String stature;

    @ApiModelProperty("三围")
    @Column(columnDefinition = "varchar(30) Comment '三围'")
    private String BWH;

    @ApiModelProperty("罩杯")
    @Column(columnDefinition = "varchar(30) Comment '罩杯'")
    private String cup;

    @ApiModelProperty("血型")
    @Column(columnDefinition = "varchar(30) Comment '血型'")
    private String bloodType;

    @ApiModelProperty("出生地址")
    @Column(columnDefinition = "varchar(300) Comment '出生地址'")
    private String birthPlace;

    @ApiModelProperty("头像")
    @Column(columnDefinition = "varchar(30) Comment '头像'")
    private String image;
}
