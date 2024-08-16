package CheckboxInJava;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {

	JButton button;
	JCheckBox checkbox;
	ImageIcon xIcon;
	ImageIcon checkIcon;
	
		MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		xIcon = new ImageIcon("Close.png");
		checkIcon= new ImageIcon("Check.png");
		
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		
		checkbox= new JCheckBox();
		checkbox.setText("IM NOT A ROBOT!!");
		checkbox.setFocusable(false);
		checkbox.setFont(new Font("Consolas",Font.PLAIN,25));
		checkbox.setSelectedIcon(checkIcon);
		checkbox.setIcon(xIcon);
		
		
		this.add(button);
		this.add(checkbox);
		this.pack();
		this.setVisible(true);
		
	}

		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button) {
				
				System.out.println(checkbox.isSelected()); 
				
			}
}
}