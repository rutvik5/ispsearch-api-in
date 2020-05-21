package com.ispsearch.ispsearchapiin.repository;

import com.ispsearch.ispsearchapiin.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer>, JpaSpecificationExecutor<Plan> {

}