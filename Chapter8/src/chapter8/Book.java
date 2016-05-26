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
public enum Book
{
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & world Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Progam", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");
    
    private final String title;
    private final String copyrightYear;
    
    Book(String title, String copyrightYear)
    {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getCopyrightYear()
    {
        return copyrightYear;
    }
}
