package com.loyola.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loyola.entity.CollegeEntity;
import com.loyola.service.CollegeServiceInt;

@RestController
public class CollegeController {
	@Autowired
	public CollegeServiceInt serviceInt;
	@PostMapping("/save")
	public CollegeEntity insert(@RequestBody CollegeEntity entity) throws Exception{
		return serviceInt.save(entity);
	}
	@RequestMapping("/list")
	public List<CollegeEntity> list(CollegeEntity entity){
		return serviceInt.listAll(entity);
	}

}
