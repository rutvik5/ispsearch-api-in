package com.ispsearch.ispsearchapiin.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "state_city")
public class StateCity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "CITY_ID", nullable = false)
    private Integer cityId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STATE_CITY_ID", insertable = false, nullable = false)
    private Integer stateCityId;

    @Column(name = "STATE_ID", nullable = false)
    private Integer stateId;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getStateCityId() {
        return stateCityId;
    }

    public void setStateCityId(Integer stateCityId) {
        this.stateCityId = stateCityId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String toString() {
      return "StateCity{cityId=" + cityId + 
        ", stateCityId=" + stateCityId + 
        ", stateId=" + stateId + 
        "}";
    }
}