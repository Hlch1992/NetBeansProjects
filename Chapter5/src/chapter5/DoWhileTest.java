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
public class DoWhileTest
{
    public static void main(String[] args)
    {
        int counter = 1;
        
        do
        {
            System.out.printf("%d  ", counter);
            ++counter;
        }while (counter <= 10);
        
        System.out.println();
    }
}
