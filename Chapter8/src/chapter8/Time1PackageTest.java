/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author Hlch1
 */
import com.deitel.javafp.ch08.Time1;

public class Time1PackageTest
{
    public static void main(String[] args)
    {
        Time1 time = new Time1();
        
        displayTime("After time object is created", time);
        System.out.println();
        
        time.setTime(13, 27, 6);
        displayTime("After calling setTime", time);
        System.out.println();
        
        try
        {
            time.setTime(99, 99, 99);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        
        displayTime("After calling setTime with invalid valus", time);
    }
    
    private static void displayTime(String header, Time1 t)
    {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
    }
}
