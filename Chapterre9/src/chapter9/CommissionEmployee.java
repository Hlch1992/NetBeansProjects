/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author Hlch1
 */
public class CommissionEmployee// extends Object
{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String firstName, String lastName, 
            String socialSecurityNumber, double grossSales, double commissionRate)
    {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }
    
    public void setGrossSales(double grossSales)
    {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        
        this.grossSales = grossSales;
    }
    
     public double getGrossSales()
     {
         return grossSales;
     }
     
     public void setCommissionRate(double commissionRate)
     {
         if (commissionRate <= 0.0 || commissionRate >= 1.0)
             throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
         
         this.commissionRate = commissionRate;
     }
     
     public double getCommissionRate()
     {
         return commissionRate;
     }
     
     public double earnings()
     {
         return commissionRate * grossSales;
     }
     
     @Override
     
     public String toString()
     {
         return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "commission employee", firstName, lastName,
                 "social security number", socialSecurityNumber, "gross sales", grossSales, "commission rate", commissionRate);
     }
     
     public void commissionEmployeeTest()
    {         
         System.out.println("Employee information obtained by get methods:");
         System.out.printf("%n%s %s%n", "First name is", getFirstName());
         System.out.printf("%s %s%n", "Last name is", getLastName());
         System.out.printf("%s %s%n", "Social seci=urity number is", getSocialSecurityNumber());
         System.out.printf("%s %.2f%n", "Gross sales is", getGrossSales());
         System.out.printf("%s %.2f%n", "Commission rate is", getCommissionRate());
         
         setGrossSales(5000);
         setCommissionRate(.1);
         
         System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", toString());
    }
}
