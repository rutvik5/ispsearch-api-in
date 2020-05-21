package com.ispsearch.ispsearchapiin.repository;

import com.ispsearch.ispsearchapiin.model.BookmarkPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BookmarkPlanRepository extends JpaRepository<BookmarkPlan, Integer>, JpaSpecificationExecutor<BookmarkPlan> {

}