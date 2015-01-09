import java.awt.Graphics;

import javax.swing.JPanel;


public class Shapes extends JPanel {

	private int choice;
	private int centerx;
	private int centery;
	
	public Shapes(int userChoice)
	{
		choice = userChoice;
	}

	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		
		centerx = this.getWidth() /2;
		centery = this.getHeight() /2;
		
		for (int i= 0; i < 10; i++)
		{
			switch (choice)
			{
			case 1: //draw rectangles
				g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
			case 2: //draw ovals
				g.drawOval(10 +i , 10 + i * 10,  50 + i * 10,  50 + i * 10);
				break;
			case 3: //draw circles
				//g.drawOval(100 - i/2, 100 -  i/2, 10 * i, 10 * i);
				g.drawOval(centerx - 10 * i/2, centery - 10 * i/2, 10 * i, 10 * i);
			}
		}
	}
	
}
