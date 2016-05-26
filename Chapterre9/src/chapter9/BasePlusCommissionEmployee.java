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
public class BasePlusCommissionEmployee extends CommissionEmployee
{

//    private final String firstName;
//    private final String lastName;
//    private final String socialSecurityNumber;
//    private double grossSales;
//    private double commissionRate;
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
            double grossSales, double commissionRate, double baseSalary)
    {
        /*if (grossSales < 0.0)
        {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        if (commissionRate <= 0.0 || commissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }*/

        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        
        if (baseSalary < 0.0)
        {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

    //    this.firstName = firstName;
    //    this.lastName = lastName;
    //    this.socialSecurityNumber = socialSecurityNumber;
    //    this.grossSales = grossSales;
    //    this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

    /*public String getFirstName()
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
        {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        this.grossSales = grossSales;
    }

    public double getGrossSales()
    {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate)
    {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.commissionRate = commissionRate;
    }

    public Double getCommissionRate()
    {
        return commissionRate;
    }*/

    public void setBaseSalary(double baseSalary)
    {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary()
    {
        return baseSalary;
    }

    @Override
    public double earnings()
    {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString()
    {
        return String.format("%s %s%n%s: %.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
    }

    public void basePlusCommissionEmployeeTest()
    {
        System.out.println("Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "First name is", super.getFirstName());
        System.out.printf("%s %s%n", "Last name is", super.getLastName());
        System.out.printf("%s %s%n", "Social seci=urity number is", super.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", super.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", super.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is", getBaseSalary());
        
        setBaseSalary(1000);
        
        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", toString());
    }
}
