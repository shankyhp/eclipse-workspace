package ObjectPassedAsArguments;

public class ObjectPassAsArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Garage garage = new Garage();
		Car3 car = new Car3("BMW");
		Car3 car2 = new Car3("tesla");

		garage.park(car);
		garage.park(car2);
	}

}
