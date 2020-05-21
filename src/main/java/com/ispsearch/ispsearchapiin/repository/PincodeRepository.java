package com.ispsearch.ispsearchapiin.repository;

import com.ispsearch.ispsearchapiin.model.Pincode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PincodeRepository extends JpaRepository<Pincode, Integer>, JpaSpecificationExecutor<Pincode> {

}