package com.ispsearch.ispsearchapiin.repository;

import com.ispsearch.ispsearchapiin.model.PlanReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanReviewRepository extends JpaRepository<PlanReview, Integer>, JpaSpecificationExecutor<PlanReview> {

}