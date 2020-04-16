package com.javbus.data.common.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/14 22:41
 * @Description:
 */
@Data
@MappedSuperclass
public class BaseEntity implements Serializable {
    public BaseEntity() {
        this.createTime = new Date();
        this.updateTime = new Date();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "id")
    private String id;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    @Column(name = "is_active")
    @ApiModelProperty("是否可用")
    private boolean isActive = true;
}