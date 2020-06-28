package com.chudichen.course.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chudichen.course.entity.Course;
import com.chudichen.course.entity.Teacher;
import com.chudichen.course.mapper.CourseMapper;
import com.chudichen.course.mapper.TeacherMapper;
import com.chudichen.course.service.CourseService;
import com.chudichen.course.vo.CourseVO;
import com.chudichen.course.vo.TeacherVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 课程服务
 *
 * @author Michael Chu
 * @since 2020-06-26 22:56
 */
@Service
public class CourseServiceImpl implements CourseService {

    private final CourseMapper courseMapper;
    private final TeacherMapper teacherMapper;

    public CourseServiceImpl(CourseMapper courseMapper, TeacherMapper teacherMapper) {
        this.courseMapper = courseMapper;
        this.teacherMapper = teacherMapper;
    }


    @Override
    public List<CourseVO> getCourseList() {
        List<Course> courses = courseMapper.selectList(new QueryWrapper<>());
        List<Integer> teacherIds = courses.stream().map(Course::getTeacherId).collect(Collectors.toList());
        List<Teacher> teachers = teacherMapper.selectBatchIds(teacherIds);
        Map<Integer, Teacher> teacherMap = teachers.stream().collect(Collectors.toMap(Teacher::getId, Function.identity()));

        return courses.stream().map(course -> {
            CourseVO courseVO = new CourseVO();
            BeanUtils.copyProperties(course, courseVO);

            Teacher teacher = teacherMap.get(course.getTeacherId());
            TeacherVO teacherVO = new TeacherVO();
            BeanUtils.copyProperties(teacher, teacherVO);
            courseVO.setTeacher(teacherVO);
            return courseVO;
        }).collect(Collectors.toList());
    }
}
