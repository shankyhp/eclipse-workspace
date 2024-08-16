package MenuBarInJava;

import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;


import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {

	JMenuBar menubar;
	
	JMenu filemenu;
	JMenuItem editmenu;
	JMenu helpmenu;
	
	JMenuItem loaditem;
	JMenuItem saveitem;
	JMenuItem exititem;
	
	ImageIcon loadicon;
	ImageIcon saveicon;
	ImageIcon exiticon;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		loadicon = new ImageIcon("load.png");
		saveicon = new ImageIcon("save.png");
		exiticon= new ImageIcon("exit.png");
		
		menubar = new JMenuBar();
		
		filemenu = new JMenu("File");
		editmenu = new JMenu("Edit");
		helpmenu = new JMenu("Help");
		
		loaditem = new JMenuItem("Load");
		saveitem = new JMenuItem("Save");
		exititem = new JMenuItem("Exit");
		
		loaditem.addActionListener(this);
		saveitem.addActionListener(this);
		exititem.addActionListener(this);
		
		loaditem.setIcon(loadicon);
		saveitem.setIcon(saveicon);
		exititem.setIcon(exiticon);
		
		filemenu.setMnemonic(KeyEvent.VK_F); //Press Alt+f for File
		editmenu.setMnemonic(KeyEvent.VK_E); //Press Alt+e for edit
		helpmenu.setMnemonic(KeyEvent.VK_H); //PressAlt+h for Help
		loaditem.setMnemonic(KeyEvent.VK_L); //Press L/l to load file
		saveitem.setMnemonic(KeyEvent.VK_S); //Press S/s to save file
		exititem.setMnemonic(KeyEvent.VK_E); //Press E/e to exit file


		filemenu.add(loaditem);
		filemenu.add(saveitem);
		filemenu.add(exititem);

		menubar.add(filemenu);
		menubar.add(editmenu);
		menubar.add(helpmenu);
		this.setJMenuBar(menubar);
		this.setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==loaditem) {
			System.out.println("You Loaded A File");
		
	}
	
	if(e.getSource()==saveitem) {
		System.out.println("You Saved A File");
	
}

if(e.getSource()==exititem) {
		System.exit(0);

}
	}
}


