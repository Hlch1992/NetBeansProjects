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
public class OverloadedMethods
{

    public OverloadedMethods()
    {
        Integer[] integerArray =
        {
            1, 2, 3, 4, 5, 6
        };
        Double[] doubleArray =
        {
            1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7
        };
        Character[] characterArray =
        {
            'H', 'E', 'L', 'L', 'O'
        };

        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray);
        System.out.printf("Array doubleArray contains:%n");
        printArray(doubleArray);
        System.out.printf("Array characterArray contains:%n");
        printArray(characterArray);
    }

    public static void printArray(Integer[] inputArray)
    {
        for (Integer element : inputArray)
        {
            System.out.printf("%s ", element);
        }

        System.out.println();
    }

    /*public static <T> void printArray(T[] inputArray)
    {
        for (T element : inputArray)
            System.out.printf("%s ", element);
        
        System.out.println();
    }*/
    
    public static void printArray(Object[] inputArray)
    {
        for (Object element : inputArray)
            System.out.printf("%s ", element);
        
        System.out.println();
    }
}
