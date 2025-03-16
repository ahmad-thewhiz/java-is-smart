package com.ahmad.config;

import com.ahmad.Alien;
import com.ahmad.Computer;
import com.ahmad.Desktop;
import com.ahmad.Lap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.ahmad")
public class AppConfig {

//    @Bean
//    public Alien alien(Computer com) {
////  public Alien alien(@Qualifier("desktop1") Computer com) {
//        Alien obj=new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean(name= {"com2","desktop1"})
//    @Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Lap lap() {
//        return new Lap();
//    }
}
