import java.util.ArrayList;


public class ArrayListCollection {

	public static void main(String[] args) {
	
		//create arraylist
		ArrayList<String> items = new ArrayList<String>();
		
		//Java 7 simplfied
		//ArrayList<String> items = new ArrayList<>();
		
		items.add("red");
		items.add(0, "yellow");
		
		//header
		System.out.print("Display list contents with counter-controlled loop:");
		
		//display the colors in the list
		for (int i = 0; i < items.size(); i++)
		{
			System.out.printf(" %s", items.get(i));
			
		}
		
		//display colors
		display(items,"%nDisplay list contents with enhanced for statement:");
		
		
		
		items.add("green");
		items.add("yellow");
		System.out.println("List with two new elements:");
		
		items.remove("yellow");
		display(items,"Remove first instance of yellow:");
		
		items.remove(1);
		display(items,"Remove second list element (green):");
		
//check if value in list
		System.out.printf("\"red\" is %sin the list%n", items.contains("red") ? "" : "not ");
		
		//display number of elements in the list
		System.out.printf("Size: %s%n", items.size());
		
		
		
	}
	
	public static void display(ArrayList<String> items, String header)
	{
		System.out.printf(header);
		
		for (String item : items)
			System.out.printf(" %s", item);
		
		System.out.println();
	}

}
