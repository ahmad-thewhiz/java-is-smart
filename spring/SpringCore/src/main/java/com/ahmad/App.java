package com.ahmad;

import com.ahmad.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // XML based approach
//        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//
//        Alien obj=(Alien)context.getBean("alien1");
//        obj.setAge(21);
//        System.out.println(obj.getAge());
//        obj.code();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj=context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();

        Desktop dt=context.getBean(Desktop.class);
        dt.compile();
        Desktop dt1=context.getBean(Desktop.class);
        dt1.compile();
    }
}
