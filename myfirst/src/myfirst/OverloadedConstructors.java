package myfirst;

public class OverloadedConstructors {

	public static void main(String[] args) {
		
		
		Pizza pizza =new Pizza("thin crust","tomato","mozarella","papporoni");
		
		
		System.out.println("here are the ingrediends of your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
	}

}
