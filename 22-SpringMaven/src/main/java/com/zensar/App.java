package com.zensar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.config.MyConfig;

public class App {
  public static void main(String[] args) {
AnnotationConfigApplicationContext context;
context=new AnnotationConfigApplicationContext(MyConfig.class);

System.out.println(context.getBean("cbean"));
System.out.println(context.getBean("sbean"));

  }
}
