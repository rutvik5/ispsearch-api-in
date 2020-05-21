package com.ispsearch.ispsearchapiin.repository;

import com.ispsearch.ispsearchapiin.model.CityPincode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CityPincodeRepository extends JpaRepository<CityPincode, Integer>, JpaSpecificationExecutor<CityPincode> {

}