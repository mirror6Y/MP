package com.mybatis.plus.demo.entity;

import java.io.Serializable;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author mirror6
 * @since 2019-07-31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_graduate")
public class Graduate extends Model<Graduate> {

    private static final long serialVersionUID = 1L;

    /**
     * 学号
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
    private String nCollege;
    /**
     * 专业
     */
    @TableField("N_PROFESSION")
    private Integer nProfession;
    /**
     * 年级
     */
    @TableField("C_GRADE")
    private String cGrade;
    /**
     * 联系方式
     */
    @TableField("C_TEL")
    private String cTel;
    /**
     * 民族
     */
    @TableField("N_PEOPLE")
    private Integer nPeople;
    /**
     * 政治面貌
     */
    @TableField("N_POLITICALSTATUS")
    private Integer nPoliticalStatus;
    /**
     * 身份证号码
     */
    @TableField("C_IDCARD")
    private String cIdCard;
    /**
     * 学历
     */
    @TableField("N_EDUCATION")
    private Integer nEducation;
    /**
     * 学位类型
     */
    @TableField("N_DEGREE")
    private Integer nDegree;
    /**
     * 家庭地址
     */
    @TableField("C_ADDRESS")
    private String cAddress;
    /**
     * 毕业时间
     */
    @TableField("D_GRADUATETIME")
    private Date dGraduateTime;


    @Override
    protected Serializable pkVal() {
        return this.cId;
    }

}
