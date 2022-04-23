package com.zensar.service;

import java.sql.Connection;
import java.util.List;

import com.zensar.bean.Employee;

public interface EmployeeService {
	Employee addEmployee(Employee employee) throws Exception;

	Employee updateEmployee(Employee employee) throws Exception;

	boolean removeEmployee(int empID) throws Exception;

	Employee findEmployee(int empID) throws Exception;

	List<Employee> findAllEmployees() throws Exception;
}
