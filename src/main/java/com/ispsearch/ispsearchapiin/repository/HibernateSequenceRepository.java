package com.ispsearch.ispsearchapiin.repository;

import com.ispsearch.ispsearchapiin.model.HibernateSequence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface HibernateSequenceRepository extends JpaRepository<HibernateSequence, Void>, JpaSpecificationExecutor<HibernateSequence> {

}