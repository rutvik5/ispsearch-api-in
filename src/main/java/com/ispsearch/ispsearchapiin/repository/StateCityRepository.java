package com.ispsearch.ispsearchapiin.repository;

import com.ispsearch.ispsearchapiin.model.StateCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface StateCityRepository extends JpaRepository<StateCity, Integer>, JpaSpecificationExecutor<StateCity> {

}