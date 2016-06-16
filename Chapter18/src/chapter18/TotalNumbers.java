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

public class TotalNumbers
{

    public TotalNumbers()
    {
        Number[] numbers =
        {
            1, 2.4, 3, 4.1
        };
        ArrayList<Number> numberList = new ArrayList<>();

        for (Number element : numbers)
        {
            numberList.add(element);
        }

        System.out.printf("numberList contains: %s%n", numberList);
        System.out.printf("Total of the elements in numberList: %.1f%n",
                sum(numberList));
    }
    
    public static double sum(ArrayList<Number> list)
    {
        double total = 0;
        for (Number element : list)
            total += element.doubleValue();
        
        return total;
    }
}
