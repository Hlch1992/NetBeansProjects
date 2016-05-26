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
public class MumberAccessTest
{
    public static void main(String[] args)
    {
        Time1 time = new Time1();
        
        time.hour = 7; // error: hour has private access in Time1
        time.minute = 15; // error: mimute has private access in Time1;
        time.second = 30; // error: second has private access in Time1;
    }
}
