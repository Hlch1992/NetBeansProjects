/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author Hlch1
 */
public class Employee
{
    private static int count = 0;
    private String firstName;
    private String lastName;
//    private Date birthDate;
//    private Date hireDate;
    
    public Employee(String firstName, String lastName/*, Date birthDate, Date hireDate*/)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        
        ++count;
        System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);
//        this.birthDate = birthDate;
//        this.hireDate = hireDate;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public static int getCount()
    {
        return count;
    }
    
    /*public String toString()
    {
        return String.format("%s, %s  Hired: %s  Birthday: %s", 
                lastName, firstName, hireDate, birthDate);
    }*/
}
