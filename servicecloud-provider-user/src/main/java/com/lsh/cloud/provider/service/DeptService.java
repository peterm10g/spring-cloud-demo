package com.lsh.cloud.provider.service;

import com.lsh.cloud.model.Dept;

import java.util.List;


public interface DeptService {

	boolean add(Dept dept);

	Dept get(Integer id);

	List<Dept> list();
}
