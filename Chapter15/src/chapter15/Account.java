/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15;

/**
 *
 * @author Hlch1
 */
import java.io.Serializable;

public class Account implements Serializable
{
    private int account;
    private String firstName;
    private String lastName;
    private double balance;
    
    public Account()
    {
        this(0, "", "", 0.0);
    }
    
    public Account(int account, String firstName, String lastName, double balance)
    {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    
    public void setAccount(int account)
    {
        this.account = account;
    }
    
    public int getAccount()
    {
        return account;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    
    public double getBalance()
    {
        return balance;
    }
}
