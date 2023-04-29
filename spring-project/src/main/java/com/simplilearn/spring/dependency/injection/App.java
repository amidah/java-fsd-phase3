package com.simplilearn.spring.dependency.injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.simplilearn.spring.dependency.injection.constructor.Employee;
import com.simplilearn.spring.dependency.injection.constructor.collection.list.Question;
import com.simplilearn.spring.dependency.injection.constructor.collection.map.QuestionAnswerMap;
import com.simplilearn.spring.dependency.injection.setter.Student;

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
        
        Question question = (Question)appContext.getBean("questionbean");
        System.out.println(question);
        
        QuestionAnswerMap questionAnswerMap = (QuestionAnswerMap)appContext.getBean("quesansmapbean");
        System.out.println(questionAnswerMap);
          
        
    }
}
