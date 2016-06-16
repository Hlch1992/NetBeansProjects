/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter17;

/**
 *
 * @author Hlch1
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysStreams
{
    public ArraysStreams()
    {
        Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};
        System.out.printf("Original values: %s%n", Arrays.asList(values));
        
        System.out.printf("Sorted values: %s%n", Arrays.stream(values).sorted().collect(Collectors.toList()));
        
        List<Integer> greaterThan4 = Arrays.stream(values).filter(value -> value > 4).collect(Collectors.toList());
        System.out.printf("Values greater than %s%n", greaterThan4);
        
        System.out.printf("Sorted values greater than 4: %s%n", Arrays.stream(values).filter(value -> value > 4).sorted().collect(Collectors.toList()));
        
        System.out.printf("Values greater than 4 (ascending streams): %s%n", greaterThan4.stream().sorted().collect(Collectors.toList()));
    }
}
