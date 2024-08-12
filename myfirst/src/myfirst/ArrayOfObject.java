package myfirst;

public class ArrayOfObject {

	public static void main(String[] args) {
		
		
		int[] numbers = new int[3];
		char[] characters = new char[4];
		String[] strings = new String[5];
		
		//Food[] fridge =new Food[3];
		Food food1 = new Food("pizza");
		Food food2 = new Food("panipuri");
		Food food3 = new Food("kachori");
		
		Food[] fridge = {food1,food2,food3};
	
		//fridge[0]= food1;
	//	fridge[1]= food2;
		//fridge[2]= food3;
		
		System.out.println(fridge[0].name);
		System.out.println(fridge[1].name);
		System.out.println(fridge[2].name);
	}

}
