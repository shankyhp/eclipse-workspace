package MouseListenerinjava;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener{
	
	JLabel label;
	
	MyFrame(){
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		this.add(label);
		this.setVisible(true);
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) // Invoked when the mouse button has been clicked (pressed and released) on a component
	{
		
		System.out.println("You Clicked The Mouse");
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) // Invoked when a mouse button has been pressed on a component
	{
	
		System.out.println("You Pressed the Mouse");
		label.setBackground(Color.yellow);
	}

	@Override
	public void mouseReleased(MouseEvent e) // Invoked when a mouse button has been released on a component
	{

		System.out.println("You Released the Mouse");
		label.setBackground(Color.green);
	}

	@Override
	public void mouseEntered(MouseEvent e) // Invoked when the mouse enters a component
	{
	
		System.out.println("You Entered the Component");
		label.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent e) //Invoked when the mouse exits a component
	{
		System.out.println("You Exited the Component");
		label.setBackground(Color.red);
		
	}

}
