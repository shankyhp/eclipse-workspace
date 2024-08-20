package DragAndDropImages;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	DragPanel dragpanel = new DragPanel();
	
	MyFrame(){
		this.setTitle("Drag & Drop demo");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
