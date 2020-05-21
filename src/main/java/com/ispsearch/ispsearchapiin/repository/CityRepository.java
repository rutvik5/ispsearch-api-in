package com.ispsearch.ispsearchapiin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.ispsearch.ispsearchapiin.model.City;

public interface CityRepository extends JpaRepository<City, Integer>, JpaSpecificationExecutor<City> {
    City findByName(String name);
}