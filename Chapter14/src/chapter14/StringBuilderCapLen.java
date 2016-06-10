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
public class StringBuilderCapLen
{
    public StringBuilderCapLen()
    {
        StringBuilder buffer = new StringBuilder("Hello, how are you?");
        
        System.out.printf("buffer = %s%nlength = %d%ncapacity =%d%n%n", 
                buffer.toString(), buffer.length(), buffer.capacity());
        buffer.ensureCapacity(75);
        System.out.printf("New capacity = %d%n%n", buffer.capacity());
        
        buffer.setLength(10);
        System.out.printf("New length = %d%n%nbuffer = %s%n", buffer.length(), buffer.toString());
    }
}
