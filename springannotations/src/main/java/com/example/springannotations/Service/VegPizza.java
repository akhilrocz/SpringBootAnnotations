package com.example.springannotations.Service;


public class VegPizza implements Pizza{


    @Override
    public String getPizza()
    {
        return "Veg Pizza";
    }

}
