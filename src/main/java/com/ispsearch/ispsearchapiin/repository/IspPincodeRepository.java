package com.ispsearch.ispsearchapiin.repository;

import com.ispsearch.ispsearchapiin.model.IspPincode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface IspPincodeRepository extends JpaRepository<IspPincode, Integer>, JpaSpecificationExecutor<IspPincode> {

}