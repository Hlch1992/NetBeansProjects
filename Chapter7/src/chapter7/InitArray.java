/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author Hlch1
 */
import java.util.Scanner;

public class InitArray
{
    private int[] number;
    
    public InitArray(int[] number){
        this.number = number;
    }
    
    public void makeArray ()
    {
//        Scanner input = new Scanner(System.in);
//        
//        int[] number = new int[3];
//        
//        for (int count = 0; count < 3; count++)
//        {
//            number[count] = input.nextInt();
//        }
        
                
        if (number.length != 3)
            System.out.printf("Error: Please re-enter the entire command, including%n" +
                    "an array size, initial value and increment.%n");
        else
        {
            int arrayLength = number[0];
            int[] array = new int[arrayLength];
            
            int initialValue = number[1];
            int increment = number[2];
            
            for (int count = 0; count < array.length; count++)
                array[count] = initialValue + increment * count;
            
            System.out.printf("%s%8s%n", "Index", "Value");
            
            for (int counter = 0; counter < array.length; counter++)
                System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
