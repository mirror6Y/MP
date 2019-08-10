package com.mybatis.plus.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mybatis.plus.demo.entity.Graduate;
import com.mybatis.plus.demo.mapper.GraduateMapper;
import com.mybatis.plus.demo.service.IGraduateService;
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
public class GraduateServiceImpl extends ServiceImpl<GraduateMapper, Graduate> implements IGraduateService {

}
