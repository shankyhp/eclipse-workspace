package JFrameInJava;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame(){
		
		
		this.setTitle("this Title Is Here"); //Sets title of this
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //Exit Out Of The Application
		this.setResizable(false); //Prevent this From Being Resized
		this.setSize(420,420); //Sets X And y Dimension Of The this
		this.setVisible(true); //Make this Visible
		
		ImageIcon image=new ImageIcon("bird.png");  //Create An Image Icon
		this.setIconImage(image.getImage()); //change icon by this
		this.getContentPane().setBackground(new Color(0,0,255)); //change Color Of Background
	}

}
