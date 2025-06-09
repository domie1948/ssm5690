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
 * 健康打卡：(HealthPunch)表实体类
 *
 */
@TableName("`health_punch`")
@Data
@EqualsAndHashCode(callSuper = false)
public class HealthPunch implements Serializable {

    // HealthPunch编号
    @TableId(value = "health_punch_id", type = IdType.AUTO)
    private Integer health_punch_id;

    // 用户编号
    @TableField(value = "`user_no`")
    private Integer user_no;
    // 用户姓名
    @TableField(value = "`user_name`")
    private String user_name;
    // 身份证号
    @TableField(value = "`id_number`")
    private String id_number;
    // 打卡日期
    @TableField(value = "`punch_date`")
    private Timestamp punch_date;
    // 体温
    @TableField(value = "`temperature`")
    private Integer temperature;
    // 有无不适
    @TableField(value = "`any_discomfort`")
    private String any_discomfort;
    // 备注
    @TableField(value = "`remarks`")
    private String remarks;









    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
