
public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] testarray = {1,2,3,4,5,6,7,8,9,10};
		
		
		//print test array values
		
		System.out.println("Test Array Values:");
		for (int i : testarray)
		{
			System.out.println(i);
		}
		
	
	ArrayObject test1 = new ArrayObject("theobject", testarray);
	test1.printValues();
	test1.modifyValueThis();
	test1.printValues();
	
	//print test array values
	
	System.out.println("Test Array Values:");
	for (int i : testarray)
	{
		System.out.println(i);
	}
	
	}

}
