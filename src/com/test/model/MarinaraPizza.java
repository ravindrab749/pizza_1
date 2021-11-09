package com.test.model;

import java.util.HashMap;
import java.util.Map;

import com.test.enums.Ingredients;

public class MarinaraPizza extends Pizza {
	
	
	public MarinaraPizza() {
		
		Map<Ingredients, Integer> itemsMap = new HashMap<>(4);
		itemsMap.put(Ingredients.TOMATO, 1);
		itemsMap.put(Ingredients.GARLIC, 1);
		itemsMap.put(Ingredients.OLIVE_OIL, 1);
		itemsMap.put(Ingredients.OREGANO, 1);
		super.setItemMap(itemsMap);
		
	}

}
