package com.chudichen.course.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 老师实体
 *
 * @author Michael Chu
 * @since 2020-06-26 22:57
 */
@Data
@TableName("pe_teacher")
public class Teacher {

    private Integer id;
    private String name;
    private String intro;
    private Integer starts;

}
