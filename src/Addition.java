
import javax.swing.JOptionPane;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstNumber = JOptionPane.showInputDialog("Enter first integer");
		String secondNumber = JOptionPane.showInputDialog("Enter second Integer");
		int number1 =0;
		int number2 = 0;
		try
		{
			number1 = Integer.parseInt(firstNumber);
			number2 = Integer.parseInt(secondNumber);
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "You entered invalid input in one of the dialogs");
		System.exit(0);
		}
		
		
		int sum = number1 + number2;
		
		JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of Two Integer", JOptionPane.PLAIN_MESSAGE);
		
	}

}
