package com.spring.a3;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class Main {

		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("a3.xml");
			Triangle obj = (Triangle) context.getBean("triangle");
			obj.draw();

		}

	}


