package SelectFileInJava;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	
MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		button = new JButton("Select File");
		button.addActionListener(this);
		
		this.add(button);
		this.pack();
		this.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		
		JFileChooser filechooser = new JFileChooser();
		
		filechooser.setCurrentDirectory(new File(".")); // '.' Opens current project file
		
		
		//int response = filechooser.showOpenDialog(null);  //Select File To Open
		int response = filechooser.showSaveDialog(null); //Select File to Save
		
		
		if(response == JFileChooser.APPROVE_OPTION) {
			
			File file = new File(filechooser.getSelectedFile().getAbsolutePath());
			System.out.println(file);
		
		}
	}
	
}
}