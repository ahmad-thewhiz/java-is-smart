package com.ahmad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NewAlien {
    public static void main(String[] args) {
        // Create Configuration and SessionFactory
        Configuration conf = new Configuration()
                .configure()
                .addAnnotatedClass(Alien.class);

        SessionFactory sf = conf.buildSessionFactory();

        // Open Session
        Session session = sf.openSession();

        Laptop l1 = new Laptop();
        l1.setBrand("ASUS");
        l1.setModel("ROG");
        l1.setRam(16);

        Alien a1 = new Alien();
        a1.setAid(2);
        a1.setName("A2");
        a1.setTech("Java");
        a1.setLaptop(l1);


        // Start Transaction (Required in Hibernate)
        session.beginTransaction();

        // Save Object
        session.persist(a1);

        // Commit Transaction and Close Session
        session.getTransaction().commit();
        session.close();
        sf.close();

        System.out.println("Done");
    }
}
