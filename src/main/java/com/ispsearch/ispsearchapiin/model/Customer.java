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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Integer getCustomerCityId() {
        return customerCityId;
    }

    public void setCustomerCityId(Integer customerCityId) {
        this.customerCityId = customerCityId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPass() {
        return customerPass;
    }

    public void setCustomerPass(String customerPass) {
        this.customerPass = customerPass;
    }

    public Integer getCustomerPincodeId() {
        return customerPincodeId;
    }

    public void setCustomerPincodeId(Integer customerPincodeId) {
        this.customerPincodeId = customerPincodeId;
    }

    public Integer getCustomerStateId() {
        return customerStateId;
    }

    public void setCustomerStateId(Integer customerStateId) {
        this.customerStateId = customerStateId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "createDate=" + createDate +
                ", customerCityId=" + customerCityId +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerPass='" + customerPass + '\'' +
                ", customerPincodeId=" + customerPincodeId +
                ", customerStateId=" + customerStateId +
                '}';
    }
}