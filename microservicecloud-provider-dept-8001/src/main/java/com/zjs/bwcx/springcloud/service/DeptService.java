package com.zjs.bwcx.springcloud.service;

import java.util.List;

import com.zjs.bwcx.springcloud.entities.Dept;

public interface DeptService {
	
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
