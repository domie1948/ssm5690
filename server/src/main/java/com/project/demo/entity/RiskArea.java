package com.project.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 风险地区：(RiskArea)表实体类
 *
 */
@TableName("`risk_area`")
@Data
@EqualsAndHashCode(callSuper = false)
public class RiskArea implements Serializable {

    // RiskArea编号
    @TableId(value = "risk_area_id", type = IdType.AUTO)
    private Integer risk_area_id;

    // 风险地区
    @TableField(value = "`risk_area`")
    private String risk_area;
    // 风险等级
    @TableField(value = "`risk_level`")
    private String risk_level;
    // 防疫要求
    @TableField(value = "`epidemic_prevention_requirements`")
    private String epidemic_prevention_requirements;
    // 图片
    @TableField(value = "`picture`")
    private String picture;

    // 点击数
    @TableField(value = "hits")
    private Integer hits;








    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
