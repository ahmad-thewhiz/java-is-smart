package com.ahmad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetData {
    public static void main(String[] args) {

        Configuration conf = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class);

        SessionFactory sf = conf.buildSessionFactory();

        // Open Session
        Session session = sf.openSession();

        Student s2=session.get(Student.class, 4);

        System.out.println(s2);

        session.close();
        sf.close();

        System.out.println("done");
    }
}