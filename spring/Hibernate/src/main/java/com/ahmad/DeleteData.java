package com.ahmad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteData {
    public static void main(String[] args) {

        Configuration conf = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class);

        SessionFactory sf = conf.buildSessionFactory();

        Session session = sf.openSession();

        Student s1=new Student();
        s1.setName("Anshu");
        s1.setRollNo(5);
        s1.setAge(20);

        Student s2=session.get(Student.class, 5);

        // Start Transaction (Required in Hibernate)
        session.beginTransaction();

        // Save Object
        session.remove(s2);

        // Commit Transaction and Close Session
        session.getTransaction().commit();

        session.close();
        sf.close();

        System.out.println("done");

    }
}