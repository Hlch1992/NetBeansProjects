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
public class Increment
{
    public static void main(String[] args)
    {
        int c = 5;
        System.out.printf("c before postincrement: %d%n", c);
        System.out.printf("    postincrementing c: %d%n", c++);
        System.out.printf(" c after postincrement: %d%n", c);
        
        System.out.println();
        
        c = 5;
        System.out.printf("c before postincrement: %d%n", c);
        System.out.printf("    postincrementing c: %d%n", ++c);
        System.out.printf(" c after postincrement: %d%n", c);
    }
}
