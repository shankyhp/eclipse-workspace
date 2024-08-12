package myfirst;

//import java.util.Scanner;
import javax.swing.JOptionPane;
public class Selftest {

	public static void main(String[] args) {
		
	/*	Scanner scanner = new Scanner(System.in);
		
		
		
		
		int x = 46;
		int y = 23;
		int temp;
		
		temp=x;
		x=y;
		y=temp;
		
		
		
		System.out.println("TUJYA SHALECHA NAME");
		String name = scanner.nextLine();
		
		
		
		System.out.println("TULA KUTLA AKDA AVDTO");
		int digit = scanner.nextInt();
		
		scanner.nextLine();*/
		
		String naav = JOptionPane.showInputDialog("NAAV SANG LEKA");
		JOptionPane.showMessageDialog(null,"KAY CHALLAY BHAU "+naav);
		
		int vay = Integer.parseInt(JOptionPane.showInputDialog("TUJA VAY KAY RE"));
		JOptionPane.showMessageDialog(null,"changla vay ahe tuja he "+vay);
		
		
		
	//	System.out.println("HEllo MR :"+name);
	//	System.out.println("YOUR DIGIT IS '+digit'"+temp+digit);
		
		
		
		
	}

}
