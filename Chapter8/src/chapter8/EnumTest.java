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
import java.util.EnumSet;

public class EnumTest
{
    public static void main(String[] args)
    {
        System.out.println("All books:");
        
        for (Book book : Book.values())
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
        
        System.out.printf("%nDisplay a range of enum constants:%n");
        
        for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP))
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
    }
}
