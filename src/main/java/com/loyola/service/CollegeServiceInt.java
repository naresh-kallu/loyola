package com.loyola.service;

import java.util.List;

import com.loyola.entity.CollegeEntity;

public interface CollegeServiceInt {
	
	public CollegeEntity save(CollegeEntity entity) throws Exception;
	public List<CollegeEntity> listAll(CollegeEntity entity);

}
