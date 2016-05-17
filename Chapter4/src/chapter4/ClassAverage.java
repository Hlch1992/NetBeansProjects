/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author Hlch1
 */
import java.util.Scanner;

public class ClassAverage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        //int gradeCounter = 1;
        int gradeCounter = 0;
        
        /*while (gradeCounter <= 10)
        {
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }        
        
        int average = total / 10;
        
        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);*/
        
        System.out.print("Enter graade or -1 to quit: ");
        int grade = input.nextInt();
        
        while (grade != -1)
        {
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }
        
        if (gradeCounter != 0)
        {
            double average = (double) total / gradeCounter;
            System.out.printf("%nTotal of the %d grades enter is %d%n",gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else
            System.out.println("No grade were entered");

    }
}
