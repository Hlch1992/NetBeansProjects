/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter16;

/**
 *
 * @author Hlch1
 */
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort1
{
    public Sort1()
    {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s%n", list);
        
        Collections.sort(list);
        System.out.printf("Sorted array elements: %s%n", list);
    }
}
