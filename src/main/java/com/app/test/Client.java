package com.app.test;

import com.app.bean.Bus;
import com.app.bean.Car;
import com.app.bean.Truck;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Car c = (Car) context.getBean("c");
        c.myEngine();
        System.out.println(c.getClass().getCanonicalName());
        System.out.println(c.myEngine().getModelyear());

        Bus b = (Bus) context.getBean("b");
        System.out.println(b.myBusEngine().getModelyear());

        Truck t = (Truck) context.getBean("t");
        System.out.println(t.myTruckEngine().getModelyear());

    }
}
