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
import java.util.ArrayList;

public class BinarySearchTest
{
    public BinarySearchTest()
    {
        String[] colors = {"red", "white", "blue", "black", "yellow", "purple", "tan", "pink"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));
        
        Collections.sort(list);
        System.out.printf("Sorted ArrayList: %s5n", list);
        printSearchResults(list, "black");
        printSearchResults(list, "red");
        printSearchResults(list, "pink");
        printSearchResults(list, "aqua");
        printSearchResults(list, "gray");
        printSearchResults(list, "teal");
    }
    
    private static void printSearchResults(List<String> list, String key)
    {
        int result = 0;
        
        System.out.printf("%nSearching for: %s%n", key);
        result = Collections.binarySearch(list, key);
        
        if (result >= 0)
            System.out.printf("Found at index %d%n", result);
        else 
            System.out.printf("Not Found (%d)%n", result);
    }
}
