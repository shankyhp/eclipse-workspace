package TwoDAnimation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener {
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image spider;
	Image backgroundImage;
	Timer timer;
	int xVelocity=900;
	int yVelocity=500;
	int x=0;
	int y=0;


	
	MyPanel(){
		
		this.setPreferredSize(new Dimension( PANEL_WIDTH,PANEL_HEIGHT));
		this.setBackground(Color.black);
		spider = new ImageIcon("spiderman.png").getImage();
		backgroundImage = new ImageIcon("city2.jpg").getImage();
		timer = new Timer(10,this);
		timer.start();
	}

	public void paint(Graphics g) {
		
		super.paint(g); //Paint Background
		
		Graphics g2D= (Graphics2D) g;
		
		g2D.drawImage(backgroundImage,0,0,null);
		g2D.drawImage(spider,x,y,null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		if(x>=PANEL_WIDTH-spider.getWidth(null)  || x<0) {
			
			xVelocity= xVelocity* -1;
			
		}
		x = x + xVelocity;
		
		if(y>=PANEL_HEIGHT-spider.getHeight(null)  || y<0) {
			
			yVelocity= yVelocity* -1;
			
		}
		y = y + yVelocity;
		
		repaint();
		
	}

}
