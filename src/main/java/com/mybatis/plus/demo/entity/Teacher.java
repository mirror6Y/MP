package com.mybatis.plus.demo.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author mirror6123
 * @since 2019-07-31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_teacher")
public class Teacher extends Model<Teacher> {

    private static final long serialVersionUID = 1L;

    /**
     * 教师工号
     */
    @TableId("C_ID")
    private String cId;
    /**
     * 密码
     */
    @TableField("C_PASSWORD")
    private String cPassword;
    /**
     * 姓名
     */
    @TableField("C_NAME")
    private String cName;
    /**
     * 性别
     */
    @TableField("N_GENDER")
    private Integer nGender;
    /**
     * 院系
     */
    @TableField("N_COLLEGE")
    private Integer nCollege;
    /**
     * 办公室
     */
    @TableField("C_OFFICE")
    private String cOffice;
    /**
     * 联系方式
     */
    @TableField("C_TEL")
    private String cTel;
    /**
     * 权限
     */
    @TableField("N_PERMISSION")
    private Integer nPermission;


    @Override
    protected Serializable pkVal() {
        return this.cId;
    }

}
