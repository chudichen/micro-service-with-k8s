package com.chudichen.course.service;

import com.alibaba.fastjson.JSON;
import com.chudichen.course.CourseSpringCloudServiceApplication;
import com.chudichen.course.service.impl.CourseServiceImpl;
import com.chudichen.course.vo.CourseVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Michael Chu
 * @since 2020-06-26 23:39
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CourseSpringCloudServiceApplication.class)
public class CourseServiceImplTest {

    @Autowired
    private CourseServiceImpl courseService;


    @Test
    public void getCourseList() {
        List<CourseVO> courseList = courseService.getCourseList();
        System.out.println(JSON.toJSONString(courseList));
    }
}
