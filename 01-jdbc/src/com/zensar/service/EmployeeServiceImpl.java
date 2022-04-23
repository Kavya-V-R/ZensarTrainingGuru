package com.zensar.service;

import java.sql.Connection;
import java.util.List;

import com.zensar.bean.Employee;
import com.zensar.db.ConnectionManager;
import com.zensar.db.EmployeeDAO;
import com.zensar.db.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO dao = new EmployeeDAOImpl();

	@Override
	public Employee addEmployee(Employee employee) throws Exception {
		Connection connection = new ConnectionManager().createConnection();
		return dao.addEmployee(connection, employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) throws Exception {
		Connection connection = new ConnectionManager().createConnection();
		return dao.updateEmployee(connection, employee);
	}

	@Override
	public boolean removeEmployee(int empID) throws Exception {
		Connection connection = new ConnectionManager().createConnection();
		return dao.removeEmployee(connection, empID);
	}

	@Override
	public Employee findEmployee(int empID) throws Exception {
		Connection connection = new ConnectionManager().createConnection();
		return dao.findEmployee(connection, empID);
	}

	@Override
	public List<Employee> findAllEmployees() throws Exception {
		Connection connection = new ConnectionManager().createConnection();
		return dao.findAllEmployees(connection);
	}

}
