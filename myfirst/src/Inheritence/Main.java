package Inheritence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car =new Car();
		
		//car.go();
		
		Bicycle bicycle = new Bicycle();
		
		bicycle.stop();
		
		System.out.println(car.speed);
		System.out.println(bicycle.speed);
		System.out.println(car.wheels);
		System.out.println(bicycle.paddels);
	}

}
