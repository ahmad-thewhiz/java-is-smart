package com.ahmad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {

    @Value("21")
    private int age;

    @Autowired
//    @Qualifier("laptop") or mark Laptop as @Primary
    private Computer com;

    public Alien() {
        System.out.println("Alien Obj Created");
    }

    @ConstructorProperties({"age","lap","salary"})
    public Alien(int age, Computer com, int salary) {
        System.out.println("Param Cons Called");
        this.age=age;
        this.com=com;
        System.out.println("Salary is:"+salary);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Obj Set Age " + age);
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Alien");
        com.compile();
    }
}
