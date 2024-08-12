package myfirst;

import javax.swing.JOptionPane;
public class gui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null,"Hello "+name);
	
		int age =Integer.parseInt(JOptionPane.showInputDialog("Enter your age?"));
		JOptionPane.showMessageDialog(null,"your age is "+age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your HEight"));
		JOptionPane.showMessageDialog(null,"your height is "+height);
	}
	

}
