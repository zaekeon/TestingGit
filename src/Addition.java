
import javax.swing.JOptionPane;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstNumber = JOptionPane.showInputDialog("Enter first integer");
		String secondNumber = JOptionPane.showInputDialog("Enter second Integer");
		
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);
		
		int sum = number1 + number2;
		
		JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of Two Integer", JOptionPane.PLAIN_MESSAGE);
		
	}

}
