package com.test;

import com.test.enums.PizzaSize;
import com.test.model.MarinaraPizza;
import com.test.model.Pizza;
import com.test.model.PizzaEval;

public class Main {
	
	//input - pizza_name, pizza_size, quantity

	public static void main(String[] args) {
		
		Pizza pizza = new MarinaraPizza();
		
		PizzaEval eval = new PizzaEval();
		System.out.println(eval.calcPrice(pizza,  PizzaSize.SMALL, 1));
		
	}
	
}
