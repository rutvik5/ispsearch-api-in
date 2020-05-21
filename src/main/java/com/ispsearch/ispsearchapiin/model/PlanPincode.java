package com.ispsearch.ispsearchapiin.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "plan_pincode")
public class PlanPincode implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "PINCODE_ID", nullable = false)
    private Integer pincodeId;

    @Column(name = "PLAN_ID", nullable = false)
    private Integer planId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLAN_PINCODE_ID", insertable = false, nullable = false)
    private Integer planPincodeId;

    public Integer getPincodeId() {
        return pincodeId;
    }

    public void setPincodeId(Integer pincodeId) {
        this.pincodeId = pincodeId;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getPlanPincodeId() {
        return planPincodeId;
    }

    public void setPlanPincodeId(Integer planPincodeId) {
        this.planPincodeId = planPincodeId;
    }

    public String toString() {
      return "PlanPincode{pincodeId=" + pincodeId + 
        ", planId=" + planId + 
        ", planPincodeId=" + planPincodeId + 
        "}";
    }
}