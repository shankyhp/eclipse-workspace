package myfirst;
import java.util.Scanner;
public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("What is your name?");
		String name =scanner.nextLine();
		System.out.println("whats ur age?");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("your fav food?");
		String food =scanner.nextLine();
		
		System.out.println("Hello "+name);
		System.out.println("you are of age of :"+age);

		System.out.println("your fav food is  "+food);
		
	}
	

}
