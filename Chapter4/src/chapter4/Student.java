/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import org.apache.log4j.Logger;

public class Student
{
    
    private final static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Student.class);

    private String name;
    private double average;
    
    public Student(String name, double average)
    {
        this.name = name;
        
        if (average > 0.0)
            if (average <= 100.0)
                this.average = average;
    }
    
    public void setName(String name)
    {
       // log.info(String.format("setting name to %s" % name));
        log.info(String.format("%s graphics", name));
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAverage(double studentAverage)
    {
        if (average > 0.0)
            if (average <= 100.0)
                this.average = studentAverage;
    }
    
    public double getAverage()
    {
        return average;
    }
    
    public String getLetterGrade()
    {
        String letterGrade = "";
        
        if (average >= 90.0) letterGrade = "A";
        else if (average >= 80.0) letterGrade = "B";
        else if (average >= 70.0) letterGrade = "c";
        else if (average >= 60.0) letterGrade = "D";
        else letterGrade = "F";
        
        return letterGrade;
    }
}
