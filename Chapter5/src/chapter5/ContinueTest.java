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
public class ContinueTest
{
    public static void main(String[] args)
    {
        for (int count = 1; count <= 10; count++)
        {
            if (count == 5)
                continue;
            
            System.out.printf("%d ", count);
        }
        
        System.out.printf("%nUsed continue to skip printing 5%n");
    }
}
