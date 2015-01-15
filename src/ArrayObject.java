
public class ArrayObject {

	private int [] values;
	private String name;
	
	
	public ArrayObject(String name, int[] values)
	{
		this.name = name;
		this.values = values;
	}
	
	
	public void printValues()
	{
		//print name
		System.out.println(name);
		
		//print array
		for (int i = 0; i < values.length; i++)
		{
			System.out.println(values[i]);
		}
	}

public void modifyValueThis()
{
	for (int i = 0; i < values.length; i++)
	{
		values[i] +=1;
	}
}

public void modifyValue(int values[])
{
	for (int i = 0; i < values.length; i++)
	{
		values[i] +=1;
	}
	
}


}


