package myfirst;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int rows;
		int coloums;
		String symbol= "";
		
		System.out.println("Enter number of rows :");
		rows = scanner.nextInt();
		System.out.println("Enter number of Coloms :");
		coloums = scanner.nextInt();
		
		System.out.println("Enter Symbol to be used :");
		symbol = scanner.next();
		
		
		for(int i=1; i<=rows; i++)
		{
		
	System.out.println();
	for(int j=1;j<=coloums;j++) {
		
		
		System.out.print(symbol);
	}
			
	}
	}
}
