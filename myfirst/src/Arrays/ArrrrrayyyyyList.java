package Arrays;

//Array List Exapmple In java


import java.util.ArrayList;

public class ArrrrrayyyyyList {


	public static void main(String[] args) {

		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("PAV BHAJI");
		food.add("VADAPAV");
		food.add("MAGGIE");
		
		
		food.set(0,"Sushi"); 
		food.remove(2);
	
		
		
		for(int i=0;i<food.size();i++)
		{
			System.out.println(food.get(i));
		}
		

	}

}
