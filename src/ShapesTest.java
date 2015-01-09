import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ShapesTest {

	public static void main(String[] args) {
		
		
		
		
		String input = JOptionPane.showInputDialog("Enter 1 to draw rectangles\n" + "Enter 2 to draw ovals\n" + "Enter 3 to draw circles");
		
		int choice = Integer.parseInt(input);
		Shapes testShape = new Shapes(choice);
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(testShape);
		application.setSize(300, 300);
		application.setVisible(true);
		

	}

}
