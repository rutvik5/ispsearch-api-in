package com.ispsearch.ispsearchapiin.repository;

import com.ispsearch.ispsearchapiin.model.PlanPincode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanPincodeRepository extends JpaRepository<PlanPincode, Integer>, JpaSpecificationExecutor<PlanPincode> {

}