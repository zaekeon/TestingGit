import java.util.Scanner;


public class SwitchExample {

	public static void main(String[] args)
	{
		int total = 0;
		int gradeCounter = 0;
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int fCount = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s%n%s%n %s%n %s%n", "Enter the integer grades in the range 0-100.","Type the end-of-file-indicator to terminate input:", "On UNIX/Linux/MAC OS X type <Ctrl> d then press Enter", "On Windows type <Ctrl> z then press Enter" );
		
		//loop until user enters the end-of-file indicator
		
		while (input.hasNext())
		{
			int grade = input.nextInt();
			total +=grade;
			++gradeCounter;
			
			switch (grade /10)
			{
			case 9: //grade was between 90
			case 10: // and 100 inclusive
				++aCount;
				break;
			case 8:
				++bCount;
				break;
			case 7:
				++cCount;
				break;
			case 6:
				++dCount;
				break;
			default: // grade was less than 60
			++fCount;
			}  //end switch
			
		} //end while
		
		System.out.printf("%nGrade Report:%n");
		
		if (gradeCounter != 0)
		{
			double average = (double) total / gradeCounter;
			
			System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
			 System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
					 "Number of students who received each grade:",
					 "A: ", aCount,   // display number of A grades
					 "B: ", bCount,   // display number of B grades
					 "C: ", cCount,   // display number of C grades
					 "D: ", dCount,   // display number of D grades
					 "F: ", fCount); // display number of F grades
		} //endif
		else
			System.out.println("No grades were entered");
		
	} //end main
}
