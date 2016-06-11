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
import java.util.ArrayList;
import java.util.Collections;
import chapter8.Time2;

public class Sort3
{
    public Sort3()
    {
        List<Time2> list = new ArrayList<>();
        
        list.add(new Time2(6, 24, 34));
        list.add(new Time2(18, 14, 58));
        list.add(new Time2(6, 05, 34));
        list.add(new Time2(12, 14, 58));
        list.add(new Time2(6, 24, 22));
        
        System.out.printf("Unsorted array elements:%n%s%n", list);
        
        Collections.sort(list, new TimeComparator());
        
        System.out.printf("Sorted list elements:%n%s%n", list);
    }
}
