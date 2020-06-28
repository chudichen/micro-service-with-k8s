package com.chudichen.course.vo;

import lombok.Data;

/**
 * @author Michael Chu
 * @since 2020-06-26 23:08
 */
@Data
public class CourseVO {

    private Integer id;
    private String title;
    private String description;
    private TeacherVO teacher;
}
