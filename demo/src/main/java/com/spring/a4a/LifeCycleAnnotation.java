package com.spring.a4a;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleAnnotation {

  @Bean
  public MyBean myBean() {
      return new MyBean();
  }

  @Bean
  public OtherBean otherBean() {
      return new OtherBean();
  }

  public static void main(String[] args) {
      ConfigurableApplicationContext context =
              new AnnotationConfigApplicationContext(LifeCycleAnnotation.class);

      context.registerShutdownHook();

      System.out.println("-- accessing bean --");
      MyBean bean = context.getBean(MyBean.class);
      bean.doSomething();

      System.out.println("-- finished --");
  }
}
