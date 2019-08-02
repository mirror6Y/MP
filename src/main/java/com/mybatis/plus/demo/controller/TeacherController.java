package com.mybatis.plus.demo.controller;


import com.mybatis.plus.demo.Constants;
import com.mybatis.plus.demo.entity.Teacher;
import com.mybatis.plus.demo.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author mirror6
 * @since 2019-07-31
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    private final ITeacherService teacherService;

    /**
     * 构造器注入teacherService
     */
    @Autowired
    public TeacherController(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }


    /**
     * 添加教师信息
     * url:"http://localhost:8088/teacher/addTeacher"
     */
    @PostMapping("/addTeacher")
    public String addTeacher() {
        Teacher teacher=new Teacher();
        teacher.setCId("123");
        teacherService.insert(teacher);
        return Constants.C_SUCCESS;
    }

}

