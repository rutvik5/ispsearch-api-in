package com.ispsearch.ispsearchapiin.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "isp")
public class Isp implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "CREATE_DATE", nullable = false)
    private LocalDateTime createDate;

    @Column(name = "ISP_AREA", nullable = false)
    private String ispArea;

    @Column(name = "ISP_CITY_ID", nullable = false)
    private Integer ispCityId;

    @Column(name = "ISP_EMAIL", nullable = false)
    private String ispEmail;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ISP_ID", insertable = false, nullable = false)
    private Integer ispId;

    @Column(name = "ISP_LOGO", nullable = false)
    private String ispLogo;

    @Column(name = "ISP_NAME", nullable = false)
    private String ispName;

    @Column(name = "ISP_PASSWORD", nullable = false)
    private String ispPassword;

    @Column(name = "ISP_PHONE", nullable = false)
    private String ispPhone;

    @Column(name = "ISP_PINCODE_ID", nullable = false)
    private Integer ispPincodeId;

    @Column(name = "ISP_STATE_ID", nullable = false)
    private Integer ispStateId;

    @Column(name = "ISP_URL", nullable = false)
    private String ispUrl;

    @Column(name = "ISVERIFIED", nullable = false)
    private boolean ISVERIFIED = false;

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getIspArea() {
        return ispArea;
    }

    public void setIspArea(String ispArea) {
        this.ispArea = ispArea;
    }

    public Integer getIspCityId() {
        return ispCityId;
    }

    public void setIspCityId(Integer ispCityId) {
        this.ispCityId = ispCityId;
    }

    public String getIspEmail() {
        return ispEmail;
    }

    public void setIspEmail(String ispEmail) {
        this.ispEmail = ispEmail;
    }

    public Integer getIspId() {
        return ispId;
    }

    public void setIspId(Integer ispId) {
        this.ispId = ispId;
    }

    public String getIspLogo() {
        return ispLogo;
    }

    public void setIspLogo(String ispLogo) {
        this.ispLogo = ispLogo;
    }

    public String getIspName() {
        return ispName;
    }

    public void setIspName(String ispName) {
        this.ispName = ispName;
    }

    public String getIspPassword() {
        return ispPassword;
    }

    public void setIspPassword(String ispPassword) {
        this.ispPassword = ispPassword;
    }

    public String getIspPhone() {
        return ispPhone;
    }

    public void setIspPhone(String ispPhone) {
        this.ispPhone = ispPhone;
    }

    public Integer getIspPincodeId() {
        return ispPincodeId;
    }

    public void setIspPincodeId(Integer ispPincodeId) {
        this.ispPincodeId = ispPincodeId;
    }

    public Integer getIspStateId() {
        return ispStateId;
    }

    public void setIspStateId(Integer ispStateId) {
        this.ispStateId = ispStateId;
    }

    public String getIspUrl() {
        return ispUrl;
    }

    public void setIspUrl(String ispUrl) {
        this.ispUrl = ispUrl;
    }

    public boolean getISVERIFIED() {
        return ISVERIFIED;
    }

    public void setISVERIFIED(boolean ISVERIFIED) {
        this.ISVERIFIED = ISVERIFIED;
    }

    public String toString() {
      return "Isp{createDate=" + createDate + 
        ", ispArea=" + ispArea + 
        ", ispCityId=" + ispCityId + 
        ", ispEmail=" + ispEmail + 
        ", ispId=" + ispId + 
        ", ispLogo=" + ispLogo + 
        ", ispName=" + ispName + 
        ", ispPassword=" + ispPassword + 
        ", ispPhone=" + ispPhone + 
        ", ispPincodeId=" + ispPincodeId + 
        ", ispStateId=" + ispStateId + 
        ", ispUrl=" + ispUrl + 
        ", ISVERIFIED=" + ISVERIFIED + 
        "}";
    }
}