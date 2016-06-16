/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18;

/**
 *
 * @author Hlch1
 */
import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T>
{

    private final ArrayList<T> elements; // ArrayList stores stack elements 

    // no-argument constructor creates a stack of the default size
    public Stack()
    {
        this(10); // default stack size
    }

    // constructor creates a stack of the specified number of elements
    public Stack(int capacity)
    {
        int initCapacity = capacity > 0 ? capacity : 10; // validate
        elements = new ArrayList<T>(initCapacity); // create ArrayList 
    }

    // push element onto stack
    public void push(T pushValue)
    {
        elements.add(pushValue); // place pushValue on Stack 
    }

    // return the top element if not empty; else throw EmptyStackException
    public T pop()
    {
        if (elements.isEmpty()) // if stack is empty
        {
            throw new EmptyStackException("Stack is empty, cannot pop");
        }

        // remove and return top element of Stack
        return elements.remove(elements.size() - 1);
    }
}
