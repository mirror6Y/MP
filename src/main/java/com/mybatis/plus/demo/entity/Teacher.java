package com.mybatis.plus.demo.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 教师实体类
 * </p>
 *
 * @author mirror6
 * @since 2019-07-07
 */
@Setter
@Getter
@TableName("t_teacher")
public class Teacher extends Model<Teacher> {

    private static final long serialVersionUID = 1L;

    /**
     * 工号
     */
    @TableId("n_id")
    private Integer nId;
    /**
     * 密码
     */
    @TableField("c_password")
    private String cPassword;
    /**
     * 姓名
     */
    @TableField("c_name")
    private String cName;
    /**
     * 性别
     */
    @TableField("n_gender")
    private Integer nGender;
    /**
     * 院系
     */
    @TableField("c_college")
    private String cCollege;
    /**
     * 办公室
     */
    @TableField("c_office")
    private String cOffice;
    /**
     * 联系方式
     */
    @TableField("c_tel")
    private String cTel;
    /**
     * 权限
     */
    @TableField("c_permission")
    private String cPermission;

    @Override
    protected Serializable pkVal() {
        return this.nId;
    }

}
