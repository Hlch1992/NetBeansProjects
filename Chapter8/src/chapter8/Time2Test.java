/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author Hlch1
 */
public class Time2Test
{

    public static void main(String[] args)
    {
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(2, 34);
        Time2 t4 = new Time2(12, 25, 42);
        Time2 t5 = new Time2(t4);

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);

        try
        {
            Time2 t6 = new Time2(27, 74, 99);
        } catch (IllegalArgumentException e)
        {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }
    }

    private static void displayTime(String header, Time2 t)
    {
        System.out.printf("%s%n %s%n %s%n", header, t.toUniversalString(), t.toString());
    }
}
