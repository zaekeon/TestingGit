
public class Arrays {

	public static void main(String[] args) {
		
		int[] array1 = new int[5];
		int[] array2 = {1,2,3,4,5};
		
		//assign values to array1
		for (int i = 0; i < array1.length; i++)
		{
			array1[i] = i + 1;
		}
		
		//loop through array2 values with enhanced for
		
		for (int i : array2)
		{
			System.out.println(i);
		}
		
		//loop through with standard for
		
		for (int i = 0; i < array1.length; i++)
		{
			System.out.println("array 1 value:" + array1[i]);
		}
		

	}

}
