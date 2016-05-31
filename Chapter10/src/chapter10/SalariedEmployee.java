/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10;

/**
 *
 * @author Hlch1
 */
public class SalariedEmployee extends Employee
{
    private double weeklySalary;
    
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary)
    {
        super(firstName, lastName, socialSecurityNumber);
        
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly Salary must be >= 0.0");
        
        this.weeklySalary = weeklySalary;
    }
    
    public void setWeeklySalary(double weeklySalary)
    {
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        
        this.weeklySalary = weeklySalary;
    }
    
    public double getWeeklySalary()
    {
        return weeklySalary;
    }
    
    @Override
    public double earnings()
    {
        return getWeeklySalary();
    }
    
    @Override
    public double getPaymentAmount()
    {
        return getWeeklySalary();
    }
    
    @Override
    public String toString()
    {
        return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
    }
}
