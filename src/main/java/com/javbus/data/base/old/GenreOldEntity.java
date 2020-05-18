package com.javbus.data.base.old;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Auther: wuliangyu
 * @Date: 2020/5/18 22:41
 * @Description:
 */
@Data
@Entity
@Table(name = "genre")
public class GenreOldEntity {

    @Id
    @ApiModelProperty("搜索ID")
    @Column(columnDefinition = "int(30) Comment '搜索ID'")
    private int genre_id;         //搜索ID

    @ApiModelProperty("类别名")
    @Column(columnDefinition = "varchar(30) Comment '类别名'")
    private String genre_name;         //类别名

    @ApiModelProperty("类别英文名")
    @Column(columnDefinition = "varchar(30) Comment '类别英文名'")
    private String genre_name_ENG;         //类别英文名
}
