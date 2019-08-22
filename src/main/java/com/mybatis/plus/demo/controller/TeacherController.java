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


    @ApiOperation(value = "获得教师信息列表", notes = "列表信息", httpMethod = "GET")
    @GetMapping("getTeachers")
    public IPage<Teacher> getTeachers(@RequestBody PageInput input) {
        Page<Teacher> page = new Page<Teacher>(input.getPageNum(), input.getPageSize());
        return teacherService.page(page);
    }

    @GetMapping("/getTeachers/{page}/{size}")
    public Map<String, Object> getTeachers(@PathVariable Integer page, @PathVariable Integer size) {
        Map<String, Object> map = new HashMap<String, Object>(16);
        Page<Teacher> teacherPage = teacherService.pageMaps(page);
                questionService.selectPage(new Page<>(page, size));

        Page<Teacher> questionPage = questionService.selectPage(new Page<>(page, size));
        if (questionPage.getRecords().size() == 0) {
            map.put("code", 400);
        } else {
            map.put("code", 200);
            map.put("data", questionPage);
        }
        return map;
    }


}

