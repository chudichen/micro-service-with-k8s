package com.chudichen.course.service;

import com.chudichen.course.vo.CourseVO;

import java.util.List;

/**
 * @author Michael Chu
 * @since 2020-06-26 22:55
 */
public interface CourseService {

    /**
     * 获取课程列表
     *
     * @return 课程列表
     */
    List<CourseVO> getCourseList();
}
