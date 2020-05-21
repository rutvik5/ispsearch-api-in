package com.ispsearch.ispsearchapiin.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "CREATE_DATE", nullable = false)
    private LocalDateTime createDate;

    @Column(name = "USER_CITY_ID", nullable = false)
    private Integer userCityId;

    @Column(name = "USER_EMAIL", nullable = false)
    private String userEmail;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", insertable = false, nullable = false)
    private Integer userId;

    @Column(name = "USER_NAME", nullable = false)
    private String userName;

    @Column(name = "USER_PASS", nullable = false)
    private String userPass;

    @Column(name = "USER_PINCODE_ID", nullable = false)
    private Integer userPincodeId;

    @Column(name = "USER_STATE_ID", nullable = false)
    private Integer userStateId;

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Integer getUserCityId() {
        return userCityId;
    }

    public void setUserCityId(Integer userCityId) {
        this.userCityId = userCityId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public Integer getUserPincodeId() {
        return userPincodeId;
    }

    public void setUserPincodeId(Integer userPincodeId) {
        this.userPincodeId = userPincodeId;
    }

    public Integer getUserStateId() {
        return userStateId;
    }

    public void setUserStateId(Integer userStateId) {
        this.userStateId = userStateId;
    }

    public String toString() {
      return "User{createDate=" + createDate + 
        ", userCityId=" + userCityId + 
        ", userEmail=" + userEmail + 
        ", userId=" + userId + 
        ", userName=" + userName + 
        ", userPass=" + userPass + 
        ", userPincodeId=" + userPincodeId + 
        ", userStateId=" + userStateId + 
        "}";
    }
}