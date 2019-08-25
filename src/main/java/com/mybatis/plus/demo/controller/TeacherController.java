package com.mybatis.plus.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatis.plus.demo.util.Constants;
import com.mybatis.plus.demo.entity.Teacher;
import com.mybatis.plus.demo.service.ITeacherService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * url:"http://localhost:8088/teacher/addTeacher"
     */
    @ApiOperation(value = "添加教师信息", notes = "添加", httpMethod = "POST")
    @PostMapping("/addTeacher")
    public String addTeacher() {
        Teacher teacher = new Teacher();
        teacher.setCId("123");
        teacherService.save(teacher);
        return Constants.C_SUCCESS;
    }

///{pageNo}/{size}  @PathVariable Integer pageNo, @PathVariable Integer size
//    @ApiOperation(value = "获得教师信息列表", notes = "列表信息", httpMethod = "GET")
//    @GetMapping("getTeachers")
//    public IPage<Teacher> getTeachers() {
//        Page<Teacher> page = new Page<Teacher>(1, 5);
//        return teacherService.page(page);
//    }

}

