/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

/**
 *
 * @author Hlch1
 */
import javax.swing.JOptionPane;

public class Addition
{
    public static void main(String[] args)
    {
        String firstNumber = JOptionPane.showInputDialog("Enter first integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");
        
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
        int sum = number1 + number2;
        
        JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
    }
}
