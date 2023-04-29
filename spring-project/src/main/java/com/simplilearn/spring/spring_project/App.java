package com.simplilearn.spring.spring_project;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Resource resource = new ClassPathResource("applicationContext.xml");
//        
//        // IOC Container - BeanFactory
//        BeanFactory factory = new XmlBeanFactory(resource);
        
        // IOC Container - Application Context
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Student student = (Student)appContext.getBean("studentbean");
        
        student.displayStudentInfo();
        
        Employee employee = (Employee)appContext.getBean("employeebean");
        employee.displayEmployeeInfo();
        
          
        
    }
}
