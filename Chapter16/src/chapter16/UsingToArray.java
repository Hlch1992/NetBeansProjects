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
import java.util.LinkedList;
import java.util.Arrays;

public class UsingToArray
{
    public UsingToArray()
    {
        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<> (Arrays.asList(colors));
        
        links.addLast("red");
        links.add("pink");
        links.add(3, "green");
        links.addFirst("cyan");
        
        colors = links.toArray(new String[links.size()]);
        
        System.out.println("colors: ");
        
        for (String color : colors)
            System.out.println(color);
    }
}
