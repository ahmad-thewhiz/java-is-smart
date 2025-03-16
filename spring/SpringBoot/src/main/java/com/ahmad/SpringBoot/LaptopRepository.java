package com.ahmad.SpringBoot;

import com.ahmad.SpringBoot.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop laptop) {
        System.out.println("Added to DB");
    }
}
