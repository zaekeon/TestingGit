
public class PolymorphismTest {

	
	public static void main(String[] args)
	{
		//super as super
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
		
		//sub as sub
		BaseCommissionEmployee baseCommissionEmployee = new BaseCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
		
		//tostring of super
		System.out.println("super using super" +commissionEmployee.toString());
		
		//tostring of sub
		System.out.println("sub using sub" + baseCommissionEmployee.toString());
		
		//tostring on sub using superclass
		CommissionEmployee commissionEmployee2 = baseCommissionEmployee;
		
		System.out.println("sub using super" + commissionEmployee2.toString());
	}
}
