package com.lsh.cloud.provider.service.impl;

import com.lsh.cloud.model.Dept;
import com.lsh.cloud.provider.dao.DeptDao;
import com.lsh.cloud.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author peter
 */
@Service
public class DeptServiceImpl implements DeptService {

	private final DeptDao deptDao;

	@Autowired
	public DeptServiceImpl(DeptDao deptDao) {
		this.deptDao = deptDao;
	}

	@Override
	public boolean add(Dept dept)
	{
		return deptDao.addDept(dept);
	}

	@Override
	public Dept get(Integer id) {
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> list()
	{
		return deptDao.findAll();
	}

}
