package com.hefshine.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.util.Emp;

public class Testing {
	
	
	public static void main(String args[])
	{
		
ApplicationContext con= new ClassPathXmlApplicationContext("config2.xml");

Emp emp=(Emp) con.getBean("e");

emp.work();
		
	}

}
