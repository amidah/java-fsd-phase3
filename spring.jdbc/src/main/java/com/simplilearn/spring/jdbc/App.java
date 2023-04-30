package com.simplilearn.spring.jdbc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 */
public class App {

  public static void main (String[] args) {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
        "applicationContext.xml");

    EmployeeDao employeeDao = (EmployeeDao) applicationContext.getBean("employeedao");

//		int result = employeeDao.saveEmployee(new Employee(100, "John", 100000));

//		int result = employeeDao.updateEmployee(new Employee(100, "Sam", 50000));

    int result = employeeDao.deleteEmployee(new Employee(100));
    System.out.println(result);
  }
}
