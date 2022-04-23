package com.zensar.db;

import java.sql.Connection;
import java.util.List;

import com.zensar.bean.Employee;

public interface EmployeeDAO {
	String INSERT_QRY = "insert into temployee1(name,basic,grade,city,doj,gender) values (?,?,?,?,?,?)";
	String UPDATE_QRY = "update temployee1 set name=?,basic=?,grade=?,city=?,doj=?,gender=? where id=?";
	String DELETE_QRY = "delete from Temployee1 where id=?";
	String FIND_QRY = "select*from Temployee1 where id=?";
	String FINDALL_QRY = "select*from Temployee1";

	Employee addEmployee(Connection connection, Employee employee)
			throws Exception;

	Employee updateEmployee(Connection connection, Employee employee)
			throws Exception;

	boolean removeEmployee(Connection connection, int empID) throws Exception;

	Employee findEmployee(Connection connection, int empID) throws Exception;

	List<Employee> findAllEmployees(Connection connection) throws Exception;
}
