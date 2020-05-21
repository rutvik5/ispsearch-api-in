package com.ispsearch.ispsearchapiin.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "isp_pincode")
public class IspPincode implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "ISP_ID", nullable = false)
    private Integer ispId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ISP_PINCODE_ID", insertable = false, nullable = false)
    private Integer ispPincodeId;

    @Column(name = "PINCODE_ID", nullable = false)
    private Integer pincodeId;

    public Integer getIspId() {
        return ispId;
    }

    public void setIspId(Integer ispId) {
        this.ispId = ispId;
    }

    public Integer getIspPincodeId() {
        return ispPincodeId;
    }

    public void setIspPincodeId(Integer ispPincodeId) {
        this.ispPincodeId = ispPincodeId;
    }

    public Integer getPincodeId() {
        return pincodeId;
    }

    public void setPincodeId(Integer pincodeId) {
        this.pincodeId = pincodeId;
    }

    public String toString() {
      return "IspPincode{ispId=" + ispId + 
        ", ispPincodeId=" + ispPincodeId + 
        ", pincodeId=" + pincodeId + 
        "}";
    }
}