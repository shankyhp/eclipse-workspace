package myfirst;

public class OverloadedMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double x=add(1.3,2.2,4.5,5.1);
	System.out.println(x);
		
	
	}

	static int add(int a,int b) {
		System.out.println("This Overloaded Method #1");
		return a+b;
		
	}
	
	
static int add(int a,int b,int c) {
		
	System.out.println("This Overloaded Method #2");
		return a+b+c;
		
	}

static int add(int a,int b,int c,int d) {
	
	System.out.println("This Overloaded Method #3");
	return a+b+c+d;
	
}


static double add(double a,double b) {
	System.out.println("This Overloaded Method #4");
	return a+b;
	
}


static double add(double a,double b,double c) {
	
System.out.println("This Overloaded Method #5");
	return a+b+c;
	
}

static double add(double a,double b,double c,double d) {

System.out.println("This Overloaded Method #6");
return a+b+c+d;

}

	
}
