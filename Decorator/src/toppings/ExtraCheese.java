package toppings;

import decorator.BasePizza;

public class ExtraCheese implements ToppingDecorator {

	BasePizza pizza;
	
	public ExtraCheese(BasePizza pizza){
		this.pizza = pizza;
	}
	
	@Override
	public int getCost() {
		
		return this.pizza.getCost()+10;
	}

}
