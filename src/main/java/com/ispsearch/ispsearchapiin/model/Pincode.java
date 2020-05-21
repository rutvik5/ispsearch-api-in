package com.ispsearch.ispsearchapiin.model;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "pincode")
@Entity
public class Pincode implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "PIN", nullable = false)
    private Integer PIN;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "PINCODE_ID", nullable = false)
    private Integer pincodeId;

    public Integer getPIN() {
        return PIN;
    }

    public void setPIN(Integer PIN) {
        this.PIN = PIN;
    }

    public Integer getPincodeId() {
        return pincodeId;
    }

    public void setPincodeId(Integer pincodeId) {
        this.pincodeId = pincodeId;
    }

    public String toString() {
      return "Pincode{PIN=" + PIN + 
        ", pincodeId=" + pincodeId + 
        "}";
    }
}