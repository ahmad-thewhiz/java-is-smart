package com.ahmad.SpringBoot;

import com.ahmad.SpringBoot.model.Laptop;
import com.ahmad.SpringBoot.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);

		LaptopService service=context.getBean(LaptopService.class);

		Laptop Lap=context.getBean(Laptop.class);
		service.addLaptop(Lap); // perform services as required

//		Alien obj = context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();

	}
}
