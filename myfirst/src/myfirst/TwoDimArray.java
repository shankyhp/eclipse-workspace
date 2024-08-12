package myfirst;



import java.util.ArrayList;
public class TwoDimArray {

	
	public static void main(String[] args)
	
	{
		
		ArrayList<ArrayList<String>> groceryList= new ArrayList();
		ArrayList<String> bakeryList =new ArrayList();
		
		bakeryList.add("PASTA");
		bakeryList.add("BREAD");
		bakeryList.add("SWEETS");
		
		ArrayList<String> produceList =new ArrayList();
		
		produceList.add("tomato");
		produceList.add("onion");
		produceList.add("lemon");
		
		ArrayList<String> drinkList =new ArrayList();
		
		drinkList.add("Sprite");
		drinkList.add("Mirinda");
		
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		
		
		
		System.out.println(groceryList);
	
	}
	
}
