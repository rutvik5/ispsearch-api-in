package com.ispsearch.ispsearchapiin.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "CREATE_DATE", nullable = false)
    private LocalDateTime createDate;

    @Column(name = "CUSTOMER_CITY_ID", nullable = false)
    private Integer customerCityId;

    @Column(name = "CUSTOMER_EMAIL", nullable = false)
    private String customerEmail;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID", insertable = false, nullable = false)
    private Integer customerId;

    @Column(name = "CUSTOMER_NAME", nullable = false)
    private String customerName;

    @Column(name = "CUSTOMER_PASS", nullable = false)
    private String customerPass;

    @Column(name = "CUSTOMER_PINCODE_ID", nullable = false)
    private Integer customerPincodeId;

    @Column(name = "CUSTOMER_STATE_ID", nullable = false)
    private Integer customerStateId;

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Integer getUserCityId() {
        return customerCityId;
    }

    public void setUserCityId(Integer userCityId) {
        this.customerCityId = userCityId;
    }

    public String getUserEmail() {
        return customerEmail;
    }

    public void setUserEmail(String userEmail) {
        this.customerEmail = userEmail;
    }

    public Integer getUserId() {
        return customerId;
    }

    public void setUserId(Integer userId) {
        this.customerId = userId;
    }

    public String getUserName() {
        return customerName;
    }

    public void setUserName(String userName) {
        this.customerName = userName;
    }

    public String getUserPass() {
        return customerPass;
    }

    public void setUserPass(String userPass) {
        this.customerPass = userPass;
    }

    public Integer getUserPincodeId() {
        return customerPincodeId;
    }

    public void setUserPincodeId(Integer userPincodeId) {
        this.customerPincodeId = userPincodeId;
    }

    public Integer getUserStateId() {
        return customerStateId;
    }

    public void setUserStateId(Integer userStateId) {
        this.customerStateId = userStateId;
    }

    public String toString() {
      return "User{createDate=" + createDate + 
        ", userCityId=" + customerCityId + 
        ", userEmail=" + customerEmail + 
        ", userId=" + customerId + 
        ", userName=" + customerName + 
        ", userPass=" + customerPass + 
        ", userPincodeId=" + customerPincodeId + 
        ", userStateId=" + customerStateId + 
        "}";
    }
}