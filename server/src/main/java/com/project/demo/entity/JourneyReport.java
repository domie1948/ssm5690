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
 * 行程报备：(JourneyReport)表实体类
 *
 */
@TableName("`journey_report`")
@Data
@EqualsAndHashCode(callSuper = false)
public class JourneyReport implements Serializable {

    // JourneyReport编号
    @TableId(value = "journey_report_id", type = IdType.AUTO)
    private Integer journey_report_id;

    // 用户编号
    @TableField(value = "`user_no`")
    private Integer user_no;
    // 用户姓名
    @TableField(value = "`user_name`")
    private String user_name;
    // 身份证号
    @TableField(value = "`id_number`")
    private String id_number;
    // 电话
    @TableField(value = "`telephone`")
    private String telephone;
    // 报备日期
    @TableField(value = "`date_of_filing`")
    private Timestamp date_of_filing;
    // 有无出省
    @TableField(value = "`is_there_any_exit_from_the_province`")
    private String is_there_any_exit_from_the_province;
    // 健康码
    @TableField(value = "`health_code`")
    private String health_code;
    // 所经地区
    @TableField(value = "`area`")
    private String area;









    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
