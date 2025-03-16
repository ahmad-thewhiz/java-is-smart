package com.ahmad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

//        Alien obj=new Alien();
//        obj.code();

//        to get the above object from Spring, we need to create a container

//        it requires external packages
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

        Alien obj=(Alien)context.getBean("alien");
        obj.code();

    }
}
