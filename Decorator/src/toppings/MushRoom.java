package toppings;

import decorator.BasePizza;

public class MushRoom implements ToppingDecorator {

	BasePizza pizza;
	
	public MushRoom(BasePizza pizza){
		this.pizza = pizza;
	}
	
	@Override
	public int getCost() {
		return this.pizza.getCost()+15;
	}

}
