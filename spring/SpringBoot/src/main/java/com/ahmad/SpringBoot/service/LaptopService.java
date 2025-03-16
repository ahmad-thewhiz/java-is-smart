package com.ahmad.SpringBoot.service;

import com.ahmad.SpringBoot.model.Laptop;
import com.ahmad.SpringBoot.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository lapRep;

    public void addLaptop(Laptop Lap) {
        System.out.println("Method Called");
        lapRep.save(Lap);
    }

    public boolean isGood(Laptop laptop) {
        return true;
    }
}
