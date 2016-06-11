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
public enum MenuOption
{
    ZERO_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4);
    
    private final int value;
    
    private MenuOption(int value)
    {
        this.value = value;
    }
}
