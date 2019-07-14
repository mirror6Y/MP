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
@TableName("t_unit")
public class Unit extends Model<Unit> {

    private static final long serialVersionUID = 1L;

    /**
     * 统一社会信用代码
     */
    @TableId("c_id")
    private String cId;
    /**
     * 单位名称
     */
    @TableField("c_name")
    private String cName;
    /**
     * 通讯地址
     */
    @TableField("c_address")
    private String cAddress;
    /**
     * 邮编
     */
    @TableField("c_zipCode")
    private String cZipcode;
    /**
     * 单位所在地
     */
    @TableField("c_location")
    private String cLocation;
    /**
     * 联系人
     */
    @TableField("c_contact")
    private String cContact;
    /**
     * 联系方式
     */
    @TableField("c_contactTel")
    private String cContacttel;


    public String getcId() {
        return cId;
    }

    public Unit setcId(String cId) {
        this.cId = cId;
        return this;
    }

    public String getcName() {
        return cName;
    }

    public Unit setcName(String cName) {
        this.cName = cName;
        return this;
    }

    public String getcAddress() {
        return cAddress;
    }

    public Unit setcAddress(String cAddress) {
        this.cAddress = cAddress;
        return this;
    }

    public String getcZipcode() {
        return cZipcode;
    }

    public Unit setcZipcode(String cZipcode) {
        this.cZipcode = cZipcode;
        return this;
    }

    public String getcLocation() {
        return cLocation;
    }

    public Unit setcLocation(String cLocation) {
        this.cLocation = cLocation;
        return this;
    }

    public String getcContact() {
        return cContact;
    }

    public Unit setcContact(String cContact) {
        this.cContact = cContact;
        return this;
    }

    public String getcContacttel() {
        return cContacttel;
    }

    public Unit setcContacttel(String cContacttel) {
        this.cContacttel = cContacttel;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.cId;
    }

    @Override
    public String toString() {
        return "Unit{" +
        "cId=" + cId +
        ", cName=" + cName +
        ", cAddress=" + cAddress +
        ", cZipcode=" + cZipcode +
        ", cLocation=" + cLocation +
        ", cContact=" + cContact +
        ", cContacttel=" + cContacttel +
        "}";
    }
}
