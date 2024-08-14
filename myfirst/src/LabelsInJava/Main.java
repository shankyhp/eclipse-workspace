package LabelsInJava;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	public static void main(String[] args) {
		
		
		ImageIcon image= new ImageIcon("panchi.png");
		Border border=BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label=new JLabel(); //Creates A Label
		label.setText("BRO DO YOU CODE??"); //Set Text Of Label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); //Set TExt Left,Center,Right of image icon 
		label.setVerticalTextPosition(JLabel.TOP); //Sets Text Top,Center,bottom of image icon
		label.setForeground(new Color(0xff0000)); //set color of text
		label.setFont(new Font("MV BOLI",Font.PLAIN,20)); //Set font of text
		label.setIconTextGap(-70); // set gap of text to image
		label.setBackground(Color.BLACK); //Sets Bg Color
		label.setOpaque(true); //Display BG color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); //Sets Vertical Position Of icons + text within label
		label.setHorizontalAlignment(JLabel.CENTER); //Sets Horizontal Position Of icons + text within label
		//label.setBounds(100,100,250,250); //Sets X and Y position within frame and dimensions
		
		JFrame frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(450,450); 
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
	}

}
