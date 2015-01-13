
public class ArrayTestObject {

	private String objectName;
	private int[] values;
	
	public ArrayTestObject(String objectName, int[] values)
	{
		this.objectName = objectName;
		this.values = values;
		
	}
	
	public void modifyArray()
	{
		for (int i = 0; i < values.length; i++)
		{
		values[i] = values[i] + 2;
		System.out.println(objectName + " modified value is" + values[i]);
		}
	}
	
public void printValues()
{
	for (int i = 0; i < values.length; i++)
	{
	System.out.println(objectName + " modified value is" + values[i]);
	}
}
	
}
