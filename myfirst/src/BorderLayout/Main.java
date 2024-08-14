package BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout(10,10));
		frame.setVisible(true);
		
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();
		
		panel1.setBackground(Color.green);
		panel2.setBackground(Color.red);
		panel3.setBackground(Color.black);
		panel4.setBackground(Color.orange);
		panel5.setBackground(Color.pink);


		panel1.setPreferredSize(new Dimension(100,50));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		//-----------------SUB PANELS-------------------------
		
		JPanel panel6=new JPanel();
		JPanel panel7=new JPanel();
		JPanel panel8=new JPanel();
		JPanel panel9=new JPanel();
		JPanel panel10=new JPanel();
		
		panel6.setBackground(Color.blue);
		panel7.setBackground(Color.YELLOW);
		panel8.setBackground(Color.CYAN);
		panel9.setBackground(Color.MAGENTA);
		panel10.setBackground(Color.LIGHT_GRAY);
		
		panel5.setLayout(new BorderLayout());


		panel6.setPreferredSize(new Dimension(100,50));
		panel7.setPreferredSize(new Dimension(100,100));
		panel8.setPreferredSize(new Dimension(100,100));
		panel9.setPreferredSize(new Dimension(100,100));
		panel10.setPreferredSize(new Dimension(100,100));
		
		panel5.add(panel6,BorderLayout.NORTH);
		panel5.add(panel7,BorderLayout.SOUTH);
		panel5.add(panel8,BorderLayout.EAST);
		panel5.add(panel9,BorderLayout.WEST);
		panel5.add(panel10,BorderLayout.CENTER);
		
		//-Sub PANELS--------------------------------------------

		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.WEST);
		frame.add(panel3,BorderLayout.SOUTH);
		frame.add(panel4,BorderLayout.EAST);
		frame.add(panel5,BorderLayout.CENTER);
		
		
	}

}
