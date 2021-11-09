package com.test.model;

import java.util.HashMap;
import java.util.Map;

import com.test.enums.Ingredients;

public class Pizza {
	
	private Map<Ingredients, Integer> itemMap = new HashMap<>();

	protected Map<Ingredients, Integer> getItemMap() {
		return itemMap;
	}

	protected void setItemMap(Map<Ingredients, Integer> itemMap) {
		this.itemMap = itemMap;
	}

	/*
	 * public void addIngredient(Ingredients ing, int qty) {
	 * 
	 * if(itemMap.containsKey(ing)) { qty += itemMap.get(ing); }
	 * 
	 * this.itemMap.put(ing, qty); }
	 */

}
