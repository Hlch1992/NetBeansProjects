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
public class BreakTest
{
    public static void main(String[] args)
    {
        int count;
        
        for (count = 1; count <= 10; count++)
        {
            if (count == 5)
                break;
            
            System.out.printf("%d ", count);
        }
        
        System.out.printf("%nBroke out of loop at count = %d%n", count);
    }
}
