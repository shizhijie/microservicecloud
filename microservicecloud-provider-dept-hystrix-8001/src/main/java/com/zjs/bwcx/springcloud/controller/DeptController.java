package com.zjs.bwcx.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zjs.bwcx.springcloud.entities.Dept;
import com.zjs.bwcx.springcloud.service.DeptService;

@RestController
public class DeptController {

	@Autowired
	private DeptService service;

	@RequestMapping(value = "dept/get/{id}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processHystrix_GET")
	public Dept get(@PathVariable("id") Long id) {
		Dept dept = this.service.findById(id);
		if (null == dept) {
			throw new RuntimeException("该ID:" + id + "没有对应的dept信息");
		}
		return dept;
	}

	public Dept processHystrix_GET(@PathVariable("id") Long id) {
		return new Dept().setDeptno(id).setDname("该ID：" + id + "没有对应的信息，null--@HystrixCommand")
				.setDb_source("no database in MySQL");
	}
}
