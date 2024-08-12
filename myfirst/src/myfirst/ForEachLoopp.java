package myfirst;

import java.util.ArrayList;
public class ForEachLoopp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] animals = {"cat","rat","bird"};
		ArrayList<String> animals =new ArrayList<String>();
		
		animals.add("cat");
		animals.add("rat");
		animals.add("Sparrow");
		
		for(String i : animals) {
			
			System.out.println(i);
			
		}
		}

	}


