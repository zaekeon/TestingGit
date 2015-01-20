import java.util.Arrays;
public class ArrayManipulations {

	
	public static void main (String[] args)
	{
		//sort double into asc order
		double[] doubleArray = {8.4,9.3,0.2,7.9,3.4};
		Arrays.sort(doubleArray);
		System.out.printf("%ndoubleArray: ");
		
		for (double value : doubleArray)
		{
			System.out.printf("%.1f ", value);
			
		}
		
		//fill array
		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray, 8);
		displayArray(filledIntArray, "filledIntArray");
		
		//copy array intArray into array intArrayCopy
		int[] intArray = {1,2,3,4,5,6,7,8,9,10};
		int[] intArrayCopy = new int[intArray.length];
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		displayArray(intArray, "intArrray");
		displayArray(intArrayCopy, "intArrayCopy");
		
		//compare intarray and intarraycopy for equality
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("%n%nintArray %s intArraycopy%n", (b ? "==" : "!="));
		
		//compare intArray and filledIntArray for equality
		b = Arrays.equals(intArray, filledIntArray);
		System.out.printf("intARray %s filledIntArray", (b ? "==" : "!="));
		
		//search intArray for the value 5
		int location = Arrays.binarySearch(intArray, 5);
		
		if (location >= 0)
		{
			System.out.printf("Found 5 at element %d in intArray%n", location);
		}
		else
		{
				System.out.println("5 not found in intArray");
		}//endif
	}
	
		public static void displayArray(int[] array, String description)
		{
			System.out.printf("%n%s: ", description);
			
			for (int value : array)
			{
				System.out.printf("%d ", value);
			}
		}
		
		
		}
	
