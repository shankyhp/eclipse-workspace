package DilogueBox;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		
		
		//JOptionPane.showMessageDialog(null,"This IS Useless Info","title",JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null,"This More Useless Info","title",JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null,"Really","title",JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null,"You Have A Virus!!!","title",JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null,"Call Tech Support Now!!","title",JOptionPane.ERROR_MESSAGE);
		
		//int answer=JOptionPane.showConfirmDialog(null, "Do You Code?","This Is My title",JOptionPane.YES_NO_CANCEL_OPTION);
		//String name =JOptionPane.showInputDialog("Whats your name?: ");
		
		
		String[] responses= {"NO!You ARE AWESOMEEEEE","AWW THANKS","I KNEW That"};
		ImageIcon icon = new ImageIcon("small.png");
		JOptionPane.showOptionDialog(null, "YOU ARE AWESOMEEE", "SECRET MESSAGE", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
		
	}

}
