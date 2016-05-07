/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hlch1
 */
import java.util.Scanner;

public class Comparison {
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int number1;
        int number2;
        
        System.out.print("Enter first interger:");
        number1 = input.nextInt();
        
        System.out.print("Enter second interger:");
        number2 = input.nextInt();
        
        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);
        
        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);
        
        if (number1  < number2)
            System.out.printf("%d < %d%n", number1, number2);
        
        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);
        
        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);
        
        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);
        
    }
    
}
