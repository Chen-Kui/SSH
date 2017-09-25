package com.ck_ssh.service;

import java.util.List;

import com.ck_ssh.dao.EmployeeDao;
import com.ck_ssh.entities.Employee;

public class EmployeeService {
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public boolean lastNameIsValid(String lastName) {
		return employeeDao.getEmployeeByLastName(lastName) == null;
	}

	public void saveOrUpdate(Employee employee) {
		employeeDao.saveOrUpdate(employee);
	}

	public void delet(Integer id) {
		employeeDao.delete(id);
	}

	public List<Employee> getAll() {
		return employeeDao.getAll();
	}

	public Employee get(Integer id) {
		return employeeDao.get(id);
	}
}
