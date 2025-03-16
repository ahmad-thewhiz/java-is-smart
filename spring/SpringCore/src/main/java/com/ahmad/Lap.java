package com.ahmad;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Lap implements Computer {
    public Lap() {
        System.out.println("Lap needed!");
    }

    @Override
    public void compile() {
        System.out.println("Lap compiled!");
    }


}
