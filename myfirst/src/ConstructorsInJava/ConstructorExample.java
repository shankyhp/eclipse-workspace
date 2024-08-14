package ConstructorsInJava;

public class ConstructorExample {

	public static void main(String[] args) {
		
		
		
		Human human1=new Human("shanky",26,62.50);

		Human human2=new Human("bro",28,76.50);
		
		//System.out.println(human2.name);
		human2.eat();
		human1.drink();

	}

}
