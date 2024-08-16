package RadioButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {

	JRadioButton pizzaButton;
	JRadioButton burgerButton;
	JRadioButton friesButton;
	
	ImageIcon pizzaIcon;
	ImageIcon friesIcon;
	ImageIcon burgerIcon;

	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon = new ImageIcon("pizza.png");
		friesIcon= new ImageIcon("fries.png");
		burgerIcon= new ImageIcon("burger.png");
		
		pizzaButton = new JRadioButton("Pizza");
		burgerButton = new JRadioButton("Burger");
		friesButton = new JRadioButton("Fries");
		
		
		
		ButtonGroup group= new ButtonGroup(); 
		group.add(pizzaButton);
		group.add(friesButton);
		group.add(burgerButton);
		
		pizzaButton.addActionListener(this);
		burgerButton.addActionListener(this);
		friesButton.addActionListener(this);

		pizzaButton.setIcon(pizzaIcon);
		friesButton.setIcon(friesIcon);
		burgerButton.setIcon(burgerIcon);
		
		this.add(friesButton);
		this.add(burgerButton);
		this.add(pizzaButton);
		this.pack();
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==pizzaButton) {
			
			System.out.println("You Ordered Pizza");
		}
		
		else if(e.getSource()==burgerButton) {
			
			System.out.println("You Ordered Burger");
			
		}
		
	else if(e.getSource()==friesButton) {
			
			System.out.println("You Ordered Fries");
			
		}

		
		
	}

	
	
	
}
