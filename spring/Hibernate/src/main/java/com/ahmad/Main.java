package com.ahmad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Rajveer");
        s1.setAge(20);
        s1.setRollNo(6);
        System.out.println(s1);

        // Create Configuration and SessionFactory
        Configuration conf = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class);

        SessionFactory sf = conf.buildSessionFactory();

        // Open Session
        Session session = sf.openSession();

        // Start Transaction (Required in Hibernate)
        session.beginTransaction();

        // Save Object
        session.persist(s1);

        // Commit Transaction and Close Session
        session.getTransaction().commit();
        session.close();
        sf.close();

        System.out.println("Done");
    }
}
