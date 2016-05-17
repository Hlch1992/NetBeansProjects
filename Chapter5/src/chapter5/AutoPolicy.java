/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

/**
 *
 * @author Hlch1
 */
public class AutoPolicy
{
    private int accountNumber;
    private String makeAndModel;
    private String state;
    
    public AutoPolicy(int accountNumber, String makeAndModel, String state)
    {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }
    
    public void setAccounntNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    
    public int getAccountNumber()
    {
        return accountNumber;
    }
    
    public void setMakeAndModel(String makeAndModel)
    {
        this.makeAndModel = makeAndModel;
    }
    
    public String getMakeAndModel()
    {
        return makeAndModel;
    }
    
    public void setState(String state)
    {
        this.state = state;
    }
    
    public String getState()
    {
        return state;
    }
    
    public boolean isNoFaultState()
    {
        boolean noFaultState;
        
        switch (getState())
        {
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
            default:
                noFaultState = false;
                break;
        }
        
        return noFaultState;
    }
}
