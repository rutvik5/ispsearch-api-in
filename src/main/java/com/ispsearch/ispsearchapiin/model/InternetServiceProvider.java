package com.ispsearch.ispsearchapiin.model;

import javax.persistence.*;
import java.sql.Date;

// *** remaining - add relations to columns- city state,pin

@Entity
@Table(name = "isp")
public class InternetServiceProvider {
    @Id
    @GeneratedValue
    @Column(name = "ISP_ID")
    private int id;
    @Column(name = "ISP_NAME")
    private String name;
    @Column(name = "ISP_EMAIL")
    private String email;
    @Column(name = "ISP_PASSWORD")
    private String password;
    @Column(name = "ISP_PHONE")
    private String phone;
    @Column(name = "ISP_STATE_ID")
    private String stateId;
    @Column(name = "ISP_CITY_ID")
    private String cityId;
    @Column(name = "ISP_PINCODE_ID")
    private String pincodeId;
    @Column(name = "CREATE_DATE")
    private Date createDate;
    @Column(name = "ISP_AREA")
    private String area;
    @Column(name = "ISP_LOGO")
    private String logo;
    @Column(name = "ISP_URL")
    private String url;
    @Column(name = "ISVERIFIED")
    private boolean isVerified = false;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getPincodeId() {
        return pincodeId;
    }

    public void setPincodeId(String pincodeId) {
        this.pincodeId = pincodeId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

}
