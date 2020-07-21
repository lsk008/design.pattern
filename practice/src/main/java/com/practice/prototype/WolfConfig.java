package com.practice.prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WolfConfig {

    @Bean
    public Wolf wolf(){
        Wolf wolf=new Wolf();
        wolf.setName("灰太狼");
        return wolf;
    }
}
