package com.chudichen.course.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 课程实体
 *
 * @author chudichen
 * @date 2020-06-26
 */
@Data
@TableName("pe_course")
public class Course implements Serializable {

    @TableId
    private Integer id;
    private String title;
    private String description;
    @TableField("teacher_id")
    private Integer teacherId;
}
