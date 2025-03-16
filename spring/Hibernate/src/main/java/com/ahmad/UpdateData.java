package com.ahmad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateData {
    public static void main(String[] args) {

        Configuration conf = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class);

        SessionFactory sf = conf.buildSessionFactory();

        Session session = sf.openSession();

        Student s1=new Student();
        s1.setName("Ahmad");
        s1.setRollNo(4);
        s1.setAge(21);

        // Start Transaction (Required in Hibernate)
        session.beginTransaction();

        // Save Object
        session.merge(s1);

        // Commit Transaction and Close Session
        session.getTransaction().commit();

        session.close();
        sf.close();

        System.out.println("done");

    }
}