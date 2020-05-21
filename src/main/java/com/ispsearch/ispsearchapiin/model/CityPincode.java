package com.ispsearch.ispsearchapiin.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "city_pincode")
public class CityPincode implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "CITY_ID", nullable = false)
    private Integer cityId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CITY_PINCODE_ID", insertable = false, nullable = false)
    private Integer cityPincodeId;

    @Column(name = "PINCODE_ID", nullable = false)
    private Integer pincodeId;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCityPincodeId() {
        return cityPincodeId;
    }

    public void setCityPincodeId(Integer cityPincodeId) {
        this.cityPincodeId = cityPincodeId;
    }

    public Integer getPincodeId() {
        return pincodeId;
    }

    public void setPincodeId(Integer pincodeId) {
        this.pincodeId = pincodeId;
    }

    public String toString() {
      return "CityPincode{cityId=" + cityId + 
        ", cityPincodeId=" + cityPincodeId + 
        ", pincodeId=" + pincodeId + 
        "}";
    }
}