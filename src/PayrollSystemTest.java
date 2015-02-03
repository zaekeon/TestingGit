
public class PayrollSystemTest {

	
	
	public static void main(String [] args)
	{
		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75,40);
		CommissionEmployee2 commissionEmployee = new CommissionEmployee2("Eric", "Johnson", "333-33-3333",10000, .06);
		BasePlusCommissionEmployee2 basePlusCommissionEmployee = new BasePlusCommissionEmployee2("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
		
		System.out.println("Employees processed individually");
		
		System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%n%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%n%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
		System.out.printf("%n%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
	
		
		//create four-element Employee array
		Employee2[] employees = new Employee2[4];
		
		//initialize array with Employees
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		System.out.printf("Employees processed polymorphically:%n%n");
		
		//generically process each element in array employees
		
		for (Employee2 currentEmployee : employees)
		{
			System.out.println(currentEmployee);
			
			if (currentEmployee instanceof BasePlusCommissionEmployee2)
			{
				//downcast employee reference to basepluscommisisonemployee2 reference
				BasePlusCommissionEmployee2 employee = (BasePlusCommissionEmployee2) currentEmployee;
				
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				
				System.out.printf("new base salary with 10%% increase is $%,.2f%n", employee.getBaseSalary());
			} //endif
			
			System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
			
		}//endfor
		
		//get type name of each object in employees array
		
	for (int j = 0; j < employees.length; j++)
	{
		System.out.printf("Employees %d is a %s%n", j, employees[j].getClass().getName());
	} //end for
	
	} //end main
	
} //end class
