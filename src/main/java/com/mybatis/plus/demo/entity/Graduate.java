package com.mybatis.plus.demo.entity;

import java.io.Serializable;

import java.util.Date;
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
@TableName("t_graduate")
public class Graduate extends Model<Graduate> {

    private static final long serialVersionUID = 1L;

    /**
     * 学号
     */
    @TableId("n_id")
    private Integer nId;
    /**
     * 姓名
     */
    @TableField("c_name")
    private String cName;
    /**
     * 身份证号
     */
    @TableField("c_idCard")
    private String cIdcard;
    /**
     * 性别
     */
    @TableField("n_gender")
    private Integer nGender;
    /**
     * 民族
     */
    @TableField("c_people")
    private String cPeople;
    /**
     * 政治面貌
     */
    @TableField("c_politicalStatus")
    private String cPoliticalstatus;
    /**
     * 院系
     */
    @TableField("c_college")
    private String cCollege;
    /**
     * 专业
     */
    @TableField("c_profession")
    private String cProfession;
    /**
     * 班级
     */
    @TableField("c_grade")
    private String cGrade;
    /**
     * 联系方式
     */
    @TableField("c_tel")
    private String cTel;
    /**
     * 毕业时间
     */
    @TableField("d_graduateTime")
    private Date dGraduatetime;
    /**
     * 学历
     */
    @TableField("c_education")
    private String cEducation;
    /**
     * 学位类别
     */
    @TableField("c_degree")
    private String cDegree;
    /**
     * 家庭地址
     */
    @TableField("c_address")
    private String cAddress;


    public Integer getnId() {
        return nId;
    }

    public Graduate setnId(Integer nId) {
        this.nId = nId;
        return this;
    }

    public String getcName() {
        return cName;
    }

    public Graduate setcName(String cName) {
        this.cName = cName;
        return this;
    }

    public String getcIdcard() {
        return cIdcard;
    }

    public Graduate setcIdcard(String cIdcard) {
        this.cIdcard = cIdcard;
        return this;
    }

    public Integer getnGender() {
        return nGender;
    }

    public Graduate setnGender(Integer nGender) {
        this.nGender = nGender;
        return this;
    }

    public String getcPeople() {
        return cPeople;
    }

    public Graduate setcPeople(String cPeople) {
        this.cPeople = cPeople;
        return this;
    }

    public String getcPoliticalstatus() {
        return cPoliticalstatus;
    }

    public Graduate setcPoliticalstatus(String cPoliticalstatus) {
        this.cPoliticalstatus = cPoliticalstatus;
        return this;
    }

    public String getcCollege() {
        return cCollege;
    }

    public Graduate setcCollege(String cCollege) {
        this.cCollege = cCollege;
        return this;
    }

    public String getcProfession() {
        return cProfession;
    }

    public Graduate setcProfession(String cProfession) {
        this.cProfession = cProfession;
        return this;
    }

    public String getcGrade() {
        return cGrade;
    }

    public Graduate setcGrade(String cGrade) {
        this.cGrade = cGrade;
        return this;
    }

    public String getcTel() {
        return cTel;
    }

    public Graduate setcTel(String cTel) {
        this.cTel = cTel;
        return this;
    }

    public Date getdGraduatetime() {
        return dGraduatetime;
    }

    public Graduate setdGraduatetime(Date dGraduatetime) {
        this.dGraduatetime = dGraduatetime;
        return this;
    }

    public String getcEducation() {
        return cEducation;
    }

    public Graduate setcEducation(String cEducation) {
        this.cEducation = cEducation;
        return this;
    }

    public String getcDegree() {
        return cDegree;
    }

    public Graduate setcDegree(String cDegree) {
        this.cDegree = cDegree;
        return this;
    }

    public String getcAddress() {
        return cAddress;
    }

    public Graduate setcAddress(String cAddress) {
        this.cAddress = cAddress;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.nId;
    }

    @Override
    public String toString() {
        return "Graduate{" +
        "nId=" + nId +
        ", cName=" + cName +
        ", cIdcard=" + cIdcard +
        ", nGender=" + nGender +
        ", cPeople=" + cPeople +
        ", cPoliticalstatus=" + cPoliticalstatus +
        ", cCollege=" + cCollege +
        ", cProfession=" + cProfession +
        ", cGrade=" + cGrade +
        ", cTel=" + cTel +
        ", dGraduatetime=" + dGraduatetime +
        ", cEducation=" + cEducation +
        ", cDegree=" + cDegree +
        ", cAddress=" + cAddress +
        "}";
    }
}
