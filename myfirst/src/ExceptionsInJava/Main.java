package ExceptionsInJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		try {
		
		
		System.out.println("Enter A Whole number To Divide: ");
		int x=scanner.nextInt();
		System.out.println();
		System.out.println("Enter A Whole number To Divide By: ");
		int y=scanner.nextInt();
		System.out.println();
		
		int z=x/y;
		
		System.out.println("Result: "+z );
	}
		catch(ArithmeticException e) {
			
			System.out.println("YOU CANT DIVIDE BY ZERO");
		}
		
		catch(InputMismatchException e) {
			
			System.out.println("Please Enter A Integer");
		}
		
		finally{
			
			scanner.close();
			System.out.println("This Will Always Print");
		}


	}
}

