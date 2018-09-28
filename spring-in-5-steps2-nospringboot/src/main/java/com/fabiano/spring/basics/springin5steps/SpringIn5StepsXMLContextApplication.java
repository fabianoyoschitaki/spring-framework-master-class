package com.fabiano.spring.basics.springin5steps;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fabiano.spring.basics.springin5steps.xml.XmlPersonDAO;

@Configuration
@ComponentScan("")
public class SpringIn5StepsXMLContextApplication {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = 
			new ClassPathXmlApplicationContext("applicationContext.xml")) {
			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(personDao);
			System.out.println(personDao.getXmlJdbcConnection());
		}
	}
}
