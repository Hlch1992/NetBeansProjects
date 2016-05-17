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
public class Sum
{
    public static void main(String[] args)
    {
        int total = 0;
        
        for (int number = 2; number <= 20; number += 2)
            total += number;
        System.out.printf("Sum is %d%n", total);
    }
}
