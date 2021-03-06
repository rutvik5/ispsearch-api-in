package com.ispsearch.ispsearchapiin.repository;

import com.ispsearch.ispsearchapiin.model.BookmarkIsp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BookmarkIspRepository extends JpaRepository<BookmarkIsp, Integer>, JpaSpecificationExecutor<BookmarkIsp> {

}