package com.mybatis.plus.demo.controller;


import com.mybatis.plus.demo.entity.Teacher;
import com.mybatis.plus.demo.service.ITeacherService;
import com.mybatis.plus.demo.util.ResponseFactory;
import com.mybatis.plus.demo.util.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    @ApiOperation(value = "添加教师信息", notes = "添加", httpMethod = "POST")
    @PostMapping("addTeacher")
    public Result addTeacher() {
        Teacher teacher = new Teacher();
        teacher.setCId("123");
        return ResponseFactory.build(teacherService.save(teacher));
    }

    @ApiOperation(value = "删除教师信息", notes = "删除", httpMethod = "DELETE")
    @DeleteMapping("deleteTeacherById/{id}")
    public Result deleteTeacherById(@PathVariable Integer id) {
        return ResponseFactory.build(teacherService.removeById(id));
    }

    @ApiOperation(value = "编辑教师信息", notes = "修改", httpMethod = "PUT")
    @PutMapping("updateTeacher")
    public Result updateTeacher() {
        Teacher teacher = new Teacher();
        teacher.setCId("111");
        teacher.setCName("111");
        return ResponseFactory.build(teacherService.updateById(teacher));
    }

    @ApiOperation(value = "查询教师信息", notes = "查找", httpMethod = "GET")
    @GetMapping("getTeacherById/{id}")
    public Result getTeacherById(@PathVariable Integer id) {
        return ResponseFactory.build(teacherService.getById(id));
    }


    ///{pageNo}/{size}  @PathVariable Integer pageNo, @PathVariable Integer size
    @ApiOperation(value = "获得教师信息列表", notes = "列表信息", httpMethod = "GET")
    @GetMapping("getTeachers")
    public List<Teacher> getTeachers() {
//        Page<Teacher> page = new Page<Teacher>(1, 5);
        return teacherService.list();
    }

}

