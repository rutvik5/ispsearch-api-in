package com.ispsearch.ispsearchapiin.model;

import javax.persistence.*;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "isp")
@Data
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
    private boolean isVerified = false;

}