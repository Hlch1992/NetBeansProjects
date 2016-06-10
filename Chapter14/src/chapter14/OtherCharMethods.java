/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;

/**
 *
 * @author Hlch1
 */
public class OtherCharMethods
{
    public OtherCharMethods()
    {
        Character c1 = 'A';
        Character c2 = 'a';
        
        System.out.printf("c1 = %s%nc2 = %s%n%n", c1.charValue(), c2.toString());
        
        if (c1.equals(c2))
            System.out.printf("c1 and c2 are equal%n");
        else
            System.out.printf("c1 and c2 are not equal%n");
    }
}
