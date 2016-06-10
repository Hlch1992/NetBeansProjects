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
public class StringBuilderConstructors
{
    public StringBuilderConstructors()
    {
        StringBuilder buffer1 = new StringBuilder();
        StringBuilder buffer2 = new StringBuilder(10);
        StringBuilder buffer3 = new StringBuilder("hello");
        
        System.out.printf("buffer1 = \"%s\"%n", buffer1);
        System.out.printf("buffer2 = \"%s\"%n", buffer2);
        System.out.printf("buffer3 = \"%s\"%n", buffer3);
    }
}
