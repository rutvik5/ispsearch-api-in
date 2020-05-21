package com.ispsearch.ispsearchapiin.repository;

import com.ispsearch.ispsearchapiin.model.IspReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IspReviewRepository extends JpaRepository<IspReview, Integer>, JpaSpecificationExecutor<IspReview> {

}