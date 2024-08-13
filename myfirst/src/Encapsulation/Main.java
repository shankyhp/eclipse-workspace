package Encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car=new Car("kia","seltos",2024);
		
		car.setYear(2022);
		car.setModel("ferrari");
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
		
		

	}

}
