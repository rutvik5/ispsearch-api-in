package com.ispsearch.ispsearchapiin.dao;

import com.ispsearch.ispsearchapiin.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDAO extends JpaRepository<City, Integer> {
    City findByName(String name);
}
