package com.zensar.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.bean.employee.Employee;

 class Main {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
Employee e=(Employee) context.getBean("employeeBean");
System.out.println(e.toString());


}
}
