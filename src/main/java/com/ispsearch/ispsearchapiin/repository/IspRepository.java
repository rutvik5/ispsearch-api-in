package com.ispsearch.ispsearchapiin.repository;

import com.ispsearch.ispsearchapiin.model.Isp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface IspRepository extends JpaRepository<Isp, Integer>, JpaSpecificationExecutor<Isp> {

}