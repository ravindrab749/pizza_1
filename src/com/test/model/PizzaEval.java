package com.test.model;

import java.util.Map;

import com.test.enums.Ingredients;
import com.test.enums.PizzaSize;
import com.test.util.Util;

public class PizzaEval {
	
	public double calcPrice(Pizza pizza, PizzaSize size, int quantity) {
		
		if(pizza == null) throw new NullPointerException(Util.NO_PIZZA_MSG);
		
		if(size == null) throw new IllegalArgumentException(Util.NO_PIZZA_SIZE_MSG);
		
		if(quantity <= 0) throw new IllegalArgumentException(Util.NO_PIZZA_QTY_MSG);
		
		double price = 0;
		
		for(Map.Entry<Ingredients, Integer> e : pizza.getItemMap().entrySet()) {
			price += (e.getKey().getPrice() * e.getValue());
		}
		
		double total = (size.getPrice() + price) * quantity;
		
		return total;
		
	}
	
	
}
