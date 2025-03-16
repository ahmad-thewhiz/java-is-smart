package com.ahmad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_Old
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

//        Alien obj=new Alien();
//        obj.code();

//        to get the above object from Spring, we need to create a container

//        it requires external packages
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        System.out.println( "here?" );
        // all objects mentioned in the file are created here

        Alien obj=(Alien)context.getBean("alien");
        Lap obj2=(Lap)context.getBean("lap");

        Lap obj3=(Lap)context.getBean("lap");

        System.out.println( "or here?" );

        // where in the above two lines is the constructor of alien being called?

        obj.code();

    }
}
