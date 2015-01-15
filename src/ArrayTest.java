
public class ArrayTest {

	public static void main(String[] args) {


		int [] value1 = {1,2,3,4,5};
		
		ArrayTestObject test = new ArrayTestObject("bacon", value1);
		
		test.modifyArray();
		
		System.out.println("Printing main method's array");
		for (int i = 0; i< value1.length;i++)
		{
			System.out.println(value1[i]);
		}
		
	ArrayTestObject test2 = new ArrayTestObject("bacon2", value1);
	test2.modifyArray();
	
	System.out.println("Printing main method's array");
	for (int i = 0; i< value1.length;i++)
	{
		System.out.println(value1[i]);
	}
	
	test.printValues();
	test2.printValues();
	
	}
	
//they share the same reference and values
	


}
