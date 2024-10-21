package com.example.springannotations;

import com.example.springannotations.Service.VegPizza;
import com.example.springannotations.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringannotationsApplication {

	public static void main(String[] args) {
    var context = SpringApplication.run(SpringannotationsApplication.class, args);
	PizzaController controller = (PizzaController) context.getBean("pizzaController");
		System.out.println(controller.getpizza());

		context.getBean(VegPizza.class);
	}

}
