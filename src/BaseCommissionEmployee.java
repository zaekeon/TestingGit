/**
 * Created by john.whites on 1/24/2015.
 */
public class BaseCommissionEmployee extends CommissionEmployee{

	private int base;


    public BaseCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, int baseSalary)
    {

    super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
this.base = baseSalary;
    }

   

  
    public double earnings()
    {
        return super.earnings() * base;
    }

    @Override
    public String toString()
    {
        return String.format("my extended class");
    }


}
