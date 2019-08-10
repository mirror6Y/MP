package com.mybatis.plus.demo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mybatis.plus.demo.entity.Teacher;
import com.mybatis.plus.demo.mapper.TeacherMapper;
import com.mybatis.plus.demo.service.ITeacherService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author mirror6
 * @since 2019-07-31
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {

}
