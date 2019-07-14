package com.mybatis.plus.demo.service.impl;

import com.mybatis.plus.demo.entity.Teacher;
import com.mybatis.plus.demo.mapper.TeacherMapper;
import com.mybatis.plus.demo.service.ITeacherService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mirror6123
 * @since 2019-07-07
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {

}
