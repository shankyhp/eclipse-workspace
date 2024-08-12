package myfirst;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args)
	
	{
		Scanner scanner =new Scanner(System.in);
		String name ="";
		
		while(name.isBlank()) {
			
			System.out.println("PLESE ENTER YOUR NAME");
			name = scanner.nextLine();
			
			
		}
		System.out.println("HEY "+name);
		
	}
}
