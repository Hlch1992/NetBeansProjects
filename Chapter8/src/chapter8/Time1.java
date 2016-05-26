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
//import org.apache.log4j.Logger;
package com.deitel.javafp.ch08;

public class Time1
{
    private int hour;
    private int minute;
    private int second;
//    private static final Logger log = Logger.getLogger(Time1.class);
    
    public void setTime(int hour, int minute, int second)
    {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60)
            
            throw new IllegalArgumentException(" hour, minute and/or second was out of range");
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    @Override
    public String toString()
    {
        return String.format("%02d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), 
                minute, second, (hour < 12 ? "AM" : "PM"));
    }
}
