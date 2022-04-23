package com.zensar.ui;

import java.util.Scanner;

public class MenuHandler {

	public void displayMenu() {
		String[] menuItems = { "Add Employee", "Search Employeee",
				"Edit Employee", "List All Employees", "Delete Employee",
				"Exit" };

		for (int i = 0; i < menuItems.length; i++) {
			System.out.println("\t\t" + (i + 1 + ".") + menuItems[i]);
		}
		System.out.println("\t\t---------------------------------------");

		System.out.print("\t\t Enter your Choice : ");
	}

	public void dispatchMenu() throws Exception {
		int choice = 0;

		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();

		try {
			switch (choice) {
			case 1:
				new UIModules().addInfo();
				break;
			case 2:
				new UIModules().searchInfo();
				break;
			case 3:
				new UIModules().editInfo();
				break;
			case 4:
				new UIModules().listInfo();
				break;
			case 5:
				new UIModules().deleteInfo();
				break;
			case 6:
				new UIModules().exit();
				break;
			default:
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
