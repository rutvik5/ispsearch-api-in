package com.ispsearch.ispsearchapiin.model;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "plan")
@Entity
public class Plan implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "DATA_LIMIT", nullable = false)
    private Integer dataLimit = 0;

    @Column(name = "DATA_LIMIT_SECONDARY", nullable = false)
    private Integer dataLimitSecondary;

    @Column(name = "DURATION", nullable = false)
    private Integer DURATION = 0;

    @Column(name = "IS_DISCOUNT_ACTIVE", nullable = false)
    private Integer discountActive = 0;

    @Column(name = "IS_PLAN_ACTIVE", nullable = false)
    private Integer planActive = 1;

    @Column(name = "ISP_ID", nullable = false)
    private Integer ispId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLAN_ID", insertable = false, nullable = false)
    private Integer planId;

    @Column(name = "PRICE_ACTUAL", nullable = false)
    private Integer priceActual;

    @Column(name = "PRICE_DISCOUNT", nullable = false)
    private Integer priceDiscount;

    @Column(name = "SPEED_PRIMARY", nullable = false)
    private Integer speedPrimary;

    @Column(name = "SPEED_SECONDARY", nullable = false)
    private Integer speedSecondary;

    @Column(name = "TYPE", nullable = false)
    private String TYPE;

    public Integer getDataLimit() {
        return dataLimit;
    }

    public void setDataLimit(Integer dataLimit) {
        this.dataLimit = dataLimit;
    }

    public Integer getDataLimitSecondary() {
        return dataLimitSecondary;
    }

    public void setDataLimitSecondary(Integer dataLimitSecondary) {
        this.dataLimitSecondary = dataLimitSecondary;
    }

    public Integer getDURATION() {
        return DURATION;
    }

    public void setDURATION(Integer DURATION) {
        this.DURATION = DURATION;
    }

    public Integer getDiscountActive() {
        return discountActive;
    }

    public void setDiscountActive(Integer discountActive) {
        this.discountActive = discountActive;
    }

    public Integer getPlanActive() {
        return planActive;
    }

    public void setPlanActive(Integer planActive) {
        this.planActive = planActive;
    }

    public Integer getIspId() {
        return ispId;
    }

    public void setIspId(Integer ispId) {
        this.ispId = ispId;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getPriceActual() {
        return priceActual;
    }

    public void setPriceActual(Integer priceActual) {
        this.priceActual = priceActual;
    }

    public Integer getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(Integer priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public Integer getSpeedPrimary() {
        return speedPrimary;
    }

    public void setSpeedPrimary(Integer speedPrimary) {
        this.speedPrimary = speedPrimary;
    }

    public Integer getSpeedSecondary() {
        return speedSecondary;
    }

    public void setSpeedSecondary(Integer speedSecondary) {
        this.speedSecondary = speedSecondary;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String toString() {
      return "Plan{dataLimit=" + dataLimit + 
        ", dataLimitSecondary=" + dataLimitSecondary + 
        ", DURATION=" + DURATION + 
        ", discountActive=" + discountActive + 
        ", planActive=" + planActive + 
        ", ispId=" + ispId + 
        ", planId=" + planId + 
        ", priceActual=" + priceActual + 
        ", priceDiscount=" + priceDiscount + 
        ", speedPrimary=" + speedPrimary + 
        ", speedSecondary=" + speedSecondary + 
        ", TYPE=" + TYPE + 
        "}";
    }
}