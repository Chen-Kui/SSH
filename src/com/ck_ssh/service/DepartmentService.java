package com.ck_ssh.service;

import java.util.List;

import com.ck_ssh.dao.DepartmentDao;
import com.ck_ssh.entities.Department;

public class DepartmentService {
	private DepartmentDao departmentDao;

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	public List<Department> getAll() {
		return departmentDao.getAll();
	}
}
