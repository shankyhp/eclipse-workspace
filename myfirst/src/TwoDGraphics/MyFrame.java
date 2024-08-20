package TwoDGraphics;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

	
	MyPanel panel;
	
	MyFrame(){
		
		panel = new MyPanel();
		
		
		this.setTitle("Drag & Drop demo");
		this.setSize(500,500);
		
		this.add(panel);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	
	
}
