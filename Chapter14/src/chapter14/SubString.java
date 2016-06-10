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
public class SubString
{
    public SubString()
    {
        String letters = "abcdefghijklmabcdefghijklm";
        
        System.out.printf("Substring from index 20 to end is \"%s\"%n", letters.substring(20));
        System.out.printf("%s \"%s\"%n", "Substring from index 3 up to, but not including 6 is", letters.substring(3, 6));
    }
}
