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
@TableName("t_protocol")
public class Protocol extends Model<Protocol> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("c_id")
    private String cId;
    /**
     * 毕业生学号
     */
    @TableField("n_graduateId")
    private Integer nGraduateid;
    /**
     * 单位统一社会信用代码
     */
    @TableField("c_unitId")
    private String cUnitid;
    /**
     * 档案接收单位名称
     */
    @TableField("c_fileRecUnit")
    private String cFilerecunit;
    /**
     * 档案接收单位地址
     */
    @TableField("c_fileRecAdd")
    private String cFilerecadd;
    /**
     * 联系人
     */
    @TableField("c_contact")
    private String cContact;
    /**
     * 邮编
     */
    @TableField("c_zipCode")
    private String cZipcode;
    /**
     * 户口接收单位
     */
    @TableField("c_accRecUnit")
    private String cAccrecunit;
    /**
     * 党、团组织关系接收单位
     */
    @TableField("c_orgRecUnit")
    private String cOrgrecunit;


    public String getcId() {
        return cId;
    }

    public Protocol setcId(String cId) {
        this.cId = cId;
        return this;
    }

    public Integer getnGraduateid() {
        return nGraduateid;
    }

    public Protocol setnGraduateid(Integer nGraduateid) {
        this.nGraduateid = nGraduateid;
        return this;
    }

    public String getcUnitid() {
        return cUnitid;
    }

    public Protocol setcUnitid(String cUnitid) {
        this.cUnitid = cUnitid;
        return this;
    }

    public String getcFilerecunit() {
        return cFilerecunit;
    }

    public Protocol setcFilerecunit(String cFilerecunit) {
        this.cFilerecunit = cFilerecunit;
        return this;
    }

    public String getcFilerecadd() {
        return cFilerecadd;
    }

    public Protocol setcFilerecadd(String cFilerecadd) {
        this.cFilerecadd = cFilerecadd;
        return this;
    }

    public String getcContact() {
        return cContact;
    }

    public Protocol setcContact(String cContact) {
        this.cContact = cContact;
        return this;
    }

    public String getcZipcode() {
        return cZipcode;
    }

    public Protocol setcZipcode(String cZipcode) {
        this.cZipcode = cZipcode;
        return this;
    }

    public String getcAccrecunit() {
        return cAccrecunit;
    }

    public Protocol setcAccrecunit(String cAccrecunit) {
        this.cAccrecunit = cAccrecunit;
        return this;
    }

    public String getcOrgrecunit() {
        return cOrgrecunit;
    }

    public Protocol setcOrgrecunit(String cOrgrecunit) {
        this.cOrgrecunit = cOrgrecunit;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.cId;
    }

    @Override
    public String toString() {
        return "Protocol{" +
        "cId=" + cId +
        ", nGraduateid=" + nGraduateid +
        ", cUnitid=" + cUnitid +
        ", cFilerecunit=" + cFilerecunit +
        ", cFilerecadd=" + cFilerecadd +
        ", cContact=" + cContact +
        ", cZipcode=" + cZipcode +
        ", cAccrecunit=" + cAccrecunit +
        ", cOrgrecunit=" + cOrgrecunit +
        "}";
    }
}
