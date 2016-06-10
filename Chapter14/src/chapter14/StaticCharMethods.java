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
import java.util.Scanner;

public class StaticCharMethods
{
    public StaticCharMethods()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character and pree Enter");
        String input = scanner.next();
        char c = input.charAt(0);
        
        System.out.printf("is defined: %b%n", Character.isDefined(c));
        System.out.printf("is digit: %b%n", Character.isDigit(c));
        System.out.printf("is first character in a Java identifier: %b%n", Character.isJavaIdentifierStart(c));
        System.out.printf("is part of a Java identifier: %b%n", Character.isJavaIdentifierPart(c));
        System.out.printf("is letter: %b%n", Character.isLetter(c));
        System.out.printf("is letter or digit: %b%n", Character.isLetterOrDigit(c));
        System.out.printf("is lower case: %b%n", Character.isLowerCase(c));
        System.out.printf("is upper case: %b%n", Character.isUpperCase(c));
        System.out.printf("to upper case: %s%n", Character.toUpperCase(c));
        System.out.printf("to lower case: %s%n", Character.toLowerCase(c));
    }
}
