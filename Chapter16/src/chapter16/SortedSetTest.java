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
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest
{
    public SortedSetTest()
    {
        String[] colors = {"yellow", "green", "black", "tan", "grey",
            "white", "orange", "red", "green"};
        
        SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));
        
        System.out.print("sorted set: ");
        printSet(tree);
        
        System.out.print("headSet (\"orange\"): ");
        printSet(tree.headSet("orange"));
        
        System.out.print("tailSet (\"orange\"): ");
        printSet(tree.tailSet("orange"));
        
        System.out.printf("first: %s%n", tree.first());
        System.out.printf("last : %s%n", tree.last());
    }
    
    private static void printSet(SortedSet<String> set)
    {
        for (String s : set)
            System.out.printf("%s ", s);
        
        System.out.println();
    }
}
