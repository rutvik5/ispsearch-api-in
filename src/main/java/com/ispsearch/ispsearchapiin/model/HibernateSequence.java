package com.ispsearch.ispsearchapiin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "hibernate_sequence")
public class HibernateSequence implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "next_val")
    private Long nextVal;

    public Long getNextVal() {
        return nextVal;
    }

    public void setNextVal(Long nextVal) {
        this.nextVal = nextVal;
    }

    public String toString() {
      return "HibernateSequence{nextVal=" + nextVal + 
        "}";
    }
}