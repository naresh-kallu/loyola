package com.loyola.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loyola.dao.CollegeDao;
import com.loyola.entity.CollegeEntity;

@Service
public class CollegeServiceImpl  implements CollegeServiceInt{
	@Autowired
	public CollegeDao dao;

	@Override
	public CollegeEntity save(CollegeEntity entity)throws Exception {
		
		return dao.save(entity);
	}

	@Override
	public List<CollegeEntity> listAll(CollegeEntity entity) {
		
		return dao.findAll();
	}

}
