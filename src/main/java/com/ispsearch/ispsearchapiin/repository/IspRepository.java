package com.ispsearch.ispsearchapiin.repository;

import com.ispsearch.ispsearchapiin.model.Isp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface IspRepository extends JpaRepository<Isp, Integer>, JpaSpecificationExecutor<Isp> {
	
	public List<Isp> findByIsVerified(boolean isVerified);
	public List<Isp> findByIspIdInAndIsVerified(List<Integer> ispIds, boolean isVerified);

}