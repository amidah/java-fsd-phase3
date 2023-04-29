package com.simplilearn.spring.spring_project;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
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
        Resource resource = new ClassPathResource("applicationContext.xml");
        
        // IOC Container - BeanFactory
        BeanFactory factory = new XmlBeanFactory(resource);
        
        Student student = (Student)factory.getBean("studentbean");
        
        student.displayStudentInfo();
        
        Employee employee = (Employee)factory.getBean("employeebean");
        employee.displayEmplyeeInfo();
        
          
        
    }
}
