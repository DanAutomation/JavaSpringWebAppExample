package com.vebinar.service;

import com.vebinar.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class App {

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class); // use beans from SpringConfig.class with
//        // annotation
//        TestBean bean = context.getBean(TestBean.class);
//        String name = bean.getName();
//        System.out.println("Hi, " + name);
 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
 TestBean bean = context.getBean(TestBean.class);
 String name = bean.getName();
        System.out.println("string is - " + name);
    }
}
