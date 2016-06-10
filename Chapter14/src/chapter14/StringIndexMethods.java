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
public class StringIndexMethods
{
    public StringIndexMethods()
    {
        String letters = "abcdefghijklmabcdefghijklm";
        
        System.out.printf("'c' is located at index %d%n", letters.indexOf('c'));
        System.out.printf("'a' is located at index %d%n", letters.indexOf('a', 1));
        System.out.printf("'$' is located at index %d%n%n", letters.indexOf('$'));
        
        System.out.printf("Last 'c' is located at index %d%n", letters.lastIndexOf('c'));
        System.out.printf("Last 'a' is located at index %d%n", letters.lastIndexOf('a', 25));
        System.out.printf("Last '$' is located at index %d%n%n", letters.lastIndexOf('$'));
        
        System.out.printf("\"def\" is located at index %d%n", letters.indexOf("def"));
        System.out.printf("\"def\" is located at index %d%n", letters.indexOf("def", 7));
        System.out.printf("\"hello\" is located at index %d%n%n", letters.indexOf("hello"));
        
        System.out.printf("Last \"def\" is located at index %d%n", letters.lastIndexOf("def"));
        System.out.printf("Last \"def\" is located at index %d%n", letters.lastIndexOf("def", 25));
        System.out.printf("Last \"hello\" is located at index %d%n", letters.lastIndexOf("hello"));
    }
}
