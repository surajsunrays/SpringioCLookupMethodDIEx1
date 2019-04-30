package com.app.test;

import com.app.bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Car c = (Car) context.getBean("c");
        c.myEngine();
        System.out.println(c.getClass().getCanonicalName());
        System.out.println(c.myEngine().getModelyear());
    }
}
