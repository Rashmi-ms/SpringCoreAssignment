package com.spring.a4;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTri {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("a4.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      context.registerShutdownHook();
   }
}


