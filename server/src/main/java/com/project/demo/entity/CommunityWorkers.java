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
 * 社区工作人员：(CommunityWorkers)表实体类
 *
 */
@TableName("`community_workers`")
@Data
@EqualsAndHashCode(callSuper = false)
public class CommunityWorkers implements Serializable {

    // CommunityWorkers编号
    @TableId(value = "community_workers_id", type = IdType.AUTO)
    private Integer community_workers_id;

    // 工号
    @TableField(value = "`job_no`")
    private String job_no;
    // 工作人员姓名
    @TableField(value = "`staff_name`")
    private String staff_name;






    // 用户编号
    @TableField(value = "user_id")
    private Integer userId;



    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
