package decorator;

import basePizzas.FreshFarm;
import toppings.ExtraCheese;
import toppings.MushRoom;

public class Client {

	
	
	public static void main(String[] args) {
		BasePizza pizza = new MushRoom(new ExtraCheese(new FreshFarm()));
		System.out.println(pizza.getCost());
	}
}
