package com.cn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		
		System.out.println(helloWorld.toString());
		
		Car car = (Car) ctx.getBean("car");
		
		System.out.println(car.toString());
	}
}
