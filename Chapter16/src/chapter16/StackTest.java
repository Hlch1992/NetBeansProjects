package chapter16;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hlch1
 */
import java.util.Stack;
import java.util.EmptyStackException;

public class StackTest
{
    public StackTest()
    {
        Stack<Number> stack = new Stack<>();
        
        stack.push(12L);
        
        System.out.println("Pushed 12L");
        printStack(stack);
        stack.push(34567);
        
        System.out.println("Pushed 34567");
        printStack(stack);
        stack.push(1.0F);
        
        System.out.println("Pushed 1.0F");
        printStack(stack);
        stack.push(1234.5678);
        
        System.out.println("Pushed 1234.5678");
        printStack(stack);
        
        try 
        {
            Number removedObject = null;
            
            while (true)
            {
                removedObject = stack.pop();
                
                System.out.printf("Poped %s%n", removedObject);
                printStack(stack);
            }
        }
        catch (EmptyStackException emptyStackException)
        {
            emptyStackException.printStackTrace();
        }
    }
    
    private static void printStack(Stack<Number> stack)
    {
        if (stack.isEmpty())
            System.out.printf("stack is empty%n%n");
        else
            System.out.printf("stack contains: %s (top)%n", stack);
    }
}
