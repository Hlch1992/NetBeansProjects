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
public class RawTypeTest
{

    public RawTypeTest()
    {
        Double[] doubleElements =
        {
            1.1, 2.2, 3.3, 4.4, 5.5
        };
        Integer[] integerElements =
        {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        Stack rawwTypeStack1 = new Stack(5);

        Stack rawTypeStack2 = new Stack<Double>(5);

        Stack<Integer> integerStack = new Stack(10);
        testPush("rawTypeStack1", rawTypeStack1, doubleElements);
        testPop("rawTypeStack1", rawTypeStack1);
        testPush("rawTypeStack2", rawTypeStack2, doubleElements);
        testPop("rawTypeStack2", rawTypeStack2);
        testPush("integerStack", integerStack, integerElements);
        testPop("integerStack", integerStack);
    }

    // generic method pushes elements onto stack
    public static <T> void testPush(String name, Stack<T> stack,
            T[] elements)
    {
        System.out.printf("%nPushing elements onto %s%n", name);

        // push elements onto Stack
        for (T element : elements)
        {
            System.out.printf("%s ", element);
            stack.push(element); // push element onto stack
        }
    }

    // generic method testPop pops elements from stack
    public static <T> void testPop(String name, Stack<T> stack)
    {
        // pop elements from stack
        try
        {
            System.out.printf("%nPopping elements from %s%n", name);
            T popValue; // store element removed from stack

            // remove elements from Stack
            while (true)
            {
                popValue = stack.pop(); // pop from stack
                System.out.printf("%s ", popValue);
            }
        } // end try
        catch (EmptyStackException emptyStackException)
        {
            System.out.println();
            emptyStackException.printStackTrace();
        }
    }
}
