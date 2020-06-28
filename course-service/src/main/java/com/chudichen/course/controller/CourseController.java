package com.chudichen.course.controller;

import com.chudichen.course.service.CourseService;
import com.chudichen.course.vo.CourseVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 课程控制器
 *
 * @author Michael Chu
 * @since 2020-06-26 22:53
 */
@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/list")
    public List<CourseVO> course() {
        return courseService.getCourseList();
    }
}
