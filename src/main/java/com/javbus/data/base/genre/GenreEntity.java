package com.javbus.data.base.genre;

import com.javbus.data.common.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: wuliangyu
 * @Date: 2020/5/19 0:12
 * @Description:
 */
@Entity
@Data
@Table(name = "t_genre")
@NoArgsConstructor
public class GenreEntity extends BaseEntity {
    @ApiModelProperty("搜索ID")
    @Column(columnDefinition = "int(30) Comment '搜索ID'")
    private int genreId;

    @ApiModelProperty("类别名")
    @Column(columnDefinition = "varchar(30) Comment '类别名'")
    private String jpaName;

    @ApiModelProperty("类别英文名")
    @Column(columnDefinition = "varchar(30) Comment '类别英文名'")
    private String engName;
}
