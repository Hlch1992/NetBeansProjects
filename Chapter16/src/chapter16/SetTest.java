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
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class SetTest
{
    public SetTest()
    {
        String[] colors = {"red", "white", "blue", "green", "gray",
            "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s%n", list);
        
        printNonDuplicates(list);
    }
    
    private static void printNonDuplicates(Collection<String> values)
    {
        Set<String> set = new HashSet<>(values);
        
        System.out.printf("%nNonduplicates are: ");
        
        for (String value : set)
            System.out.printf("%s ", value);
        
        System.out.println();
    }
}
