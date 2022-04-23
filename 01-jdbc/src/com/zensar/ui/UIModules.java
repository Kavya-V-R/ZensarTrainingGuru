package com.zensar.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.zensar.bean.Employee;
import com.zensar.bean.Gender;
import com.zensar.service.EmployeeService;
import com.zensar.service.EmployeeServiceImpl;

public class UIModules {

	EmployeeService employeeService = new EmployeeServiceImpl();

	public void addInfo() throws Exception {
		System.out.println("\t\t ADD NEW EMPLOYEE \n\n");
		System.out.println("\t\t -------------------------------");

		String name = InputPrompter.promptInputForString("Enter Name ");
		double basic = InputPrompter
				.promptInputForDouble("Enter Basic Salary ");
		char grade = InputPrompter.promptInputForChar("Enter Grade ");
		String cityName = InputPrompter
				.promptInputForString("Enter City Name ");
		LocalDate doj = InputPrompter.promptForDateInput("Enter Date of Join",
				"dd-MM-yyyy");
		Gender gender = InputPrompter
				.promptForGenderInput("Enter Gender 1.Male 2.Female ");

		Employee employee;
		employee = new Employee(name, basic, grade, cityName, doj, gender);
		employee = employeeService.addEmployee(employee);
		// store in dB

	}

	public void searchInfo() throws Exception {
		System.out.println("\t\t SEARCH EMPLOYEE \n\n");

		int id = InputPrompter.promptInputForInt("Enter Search ID ");
		Employee employee = employeeService.findEmployee(id);
		System.out.println(employee);
	}

	public void editInfo() throws Exception {
		System.out.println("\t\t EDIT EMPLOYEE \n\n");

		int id = InputPrompter.promptInputForInt("Enter ID ");
		String name = InputPrompter.promptInputForString("Enter Name ");
		double basic = InputPrompter
				.promptInputForDouble("Enter Basic Salary ");
		char grade = InputPrompter.promptInputForChar("Enter Grade ");
		String cityName = InputPrompter
				.promptInputForString("Enter City Name ");
		LocalDate doj = InputPrompter.promptForDateInput("Enter Date of Join",
				"dd-MM-yyyy");
		Gender gender = InputPrompter
				.promptForGenderInput("Enter Gender 1.Male 2.Female ");
		Employee employee = new Employee(id, name, basic, grade, cityName, doj,
				gender);
		employee = this.employeeService.updateEmployee(employee);
		System.out.println("employee updated");
		// update db
	}

	public void listInfo() throws Exception {
		System.out.println("\t\t LIST EMPLOYEES \n\n");
		List<Employee> allemployees = this.employeeService.findAllEmployees();
		for (Employee emp : allemployees) {
			System.out.println("\t\t" + emp.getId() + "\t" + emp.getName()
					+ "\t" + emp.getCityName() + "\t" + emp.getGrade() + "\t"
					+ emp.getBasicSalary() + "\t" + emp.getDateOfJoin() + "\t"
					+ emp.getGender());

		}
		// load all Employee Records and display
	}

	public void deleteInfo() throws Exception {
		System.out.println("\t\t DELETE EMPLOYEE \n\n");

		int id = InputPrompter.promptInputForInt("Enter ID to Delete ");
		boolean result = this.employeeService.removeEmployee(id);
		if (result == true)
			System.out.println("employee deleted");
		else
			System.out.println("employee not deleted");
		// delete from db
	}

	public void exit() {
		System.out.println("\t\t Exiting...Thank you... \n\n");
		System.exit(0);
	}

}