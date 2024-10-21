package com.example.springannotations.config;


import com.example.springannotations.Service.Pizza;
//import com.example.springannotations.Service.VegPizza;
import com.example.springannotations.Service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Pizza vegPizza(){
        return new VegPizza();
    }

}
