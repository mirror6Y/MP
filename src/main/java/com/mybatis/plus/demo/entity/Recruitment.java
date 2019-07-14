package com.mybatis.plus.demo.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author mirror6123
 * @since 2019-07-07
 */
@TableName("t_recruitment")
public class Recruitment extends Model<Recruitment> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("c_id")
    private String cId;
    /**
     * 招聘标题
     */
    @TableField("c_title")
    private String cTitle;
    /**
     * 招聘概述
     */
    @TableField("c_info")
    private String cInfo;
    /**
     * 招聘地点
     */
    @TableField("c_place")
    private String cPlace;
    /**
     * 薪资
     */
    @TableField("n_salary")
    private Integer nSalary;


    public String getcId() {
        return cId;
    }

    public Recruitment setcId(String cId) {
        this.cId = cId;
        return this;
    }

    public String getcTitle() {
        return cTitle;
    }

    public Recruitment setcTitle(String cTitle) {
        this.cTitle = cTitle;
        return this;
    }

    public String getcInfo() {
        return cInfo;
    }

    public Recruitment setcInfo(String cInfo) {
        this.cInfo = cInfo;
        return this;
    }

    public String getcPlace() {
        return cPlace;
    }

    public Recruitment setcPlace(String cPlace) {
        this.cPlace = cPlace;
        return this;
    }

    public Integer getnSalary() {
        return nSalary;
    }

    public Recruitment setnSalary(Integer nSalary) {
        this.nSalary = nSalary;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.cId;
    }

    @Override
    public String toString() {
        return "Recruitment{" +
        "cId=" + cId +
        ", cTitle=" + cTitle +
        ", cInfo=" + cInfo +
        ", cPlace=" + cPlace +
        ", nSalary=" + nSalary +
        "}";
    }
}
