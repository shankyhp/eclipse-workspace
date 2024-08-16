package ComboBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;


public class MyFrame extends JFrame implements ActionListener {
	
	JComboBox combobox;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"dog","cat","bird"};
		combobox = new JComboBox(animals);
		combobox.addActionListener(this);
		
		//comboBox.setEditable(true);
		  //System.out.println(comboBox.getItemCount());
		  //comboBox.addItem("horse");
		  //comboBox.insertItemAt("pig", 0);
		  //comboBox.setSelectedIndex(0);
		  //comboBox.removeItem("cat");
		  //comboBox.removeItemAt(0);
		  //comboBox.removeAllItems();
		
		this.add(combobox);
		this.pack();
		this.setVisible(true);

}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==combobox) {
			//System.out.println(combobox.getSelectedItem());	
			System.out.println(combobox.getSelectedIndex());
		}
	}
}
