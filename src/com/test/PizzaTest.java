package com.test;
import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.test.enums.PizzaSize;
import com.test.model.MarinaraPizza;
import com.test.model.Pizza;
import com.test.model.PizzaEval;

public class PizzaTest {
	
	private static PizzaEval eval = null;
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@BeforeClass
	public static void init() {
		eval = new PizzaEval();
	}
	
	@Test
	public void noPizza() {
		exception.expect(NullPointerException.class);
		exception.expectMessage("Pizza should not be null");
		eval.calcPrice(null,  PizzaSize.SMALL, 1);
		
	}
	
	@Test
	public void noPizzaSize() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Pizza Size is required");
		Pizza pizza = new MarinaraPizza();

		eval.calcPrice(pizza,  null, 1);
		
	}
	
	@Test
	public void negQuantity() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("zero / negative value not allowed");
		
		Pizza pizza = new MarinaraPizza();

		eval.calcPrice(pizza,  PizzaSize.SMALL, -1);
		
	}
	
	@Test
	public void test() {
		
		Pizza pizza = new MarinaraPizza();

		assertEquals(4.71, eval.calcPrice(pizza,  PizzaSize.SMALL, 2), 0.5);
	}
	
	@AfterClass
	public static void destroy() {
		eval = null;
	}
}
