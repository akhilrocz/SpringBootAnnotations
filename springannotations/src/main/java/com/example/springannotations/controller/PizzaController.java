package com.example.springannotations.controller;


import com.example.springannotations.Service.Pizza;
import com.example.springannotations.Service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {


    private Pizza pizza;  //Interface for loose coupling

    @Autowired
    public PizzaController(Pizza pizza){
        this.pizza=pizza;
    }

//@Autowired
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    public String getpizza(){
        return pizza.getPizza();
    }


}

