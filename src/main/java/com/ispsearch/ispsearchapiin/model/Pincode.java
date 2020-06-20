package com.ispsearch.ispsearchapiin.model;

import javax.persistence.*;

import lombok.Data;

import java.io.Serializable;

@Table(name = "pincode")
@Entity
@Data
public class Pincode implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "PIN", nullable = false)
    private Integer pin;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "PINCODE_ID", nullable = false)
    private Integer pincodeId;
}