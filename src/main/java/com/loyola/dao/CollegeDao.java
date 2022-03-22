package com.loyola.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loyola.entity.CollegeEntity;
@Repository
public interface CollegeDao extends JpaRepository<CollegeEntity, Long> {

}
