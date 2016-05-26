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
public class PackageDataTest
{
    public static void main(String[] args)
    {
        PackageData packageData = new PackageData();
        
        System.out.printf("After instantiation:%n%s%n", packageData);
        
        packageData.number = 77;
        packageData.string = "Goodbye";
        
        System.out.printf("%nAfter changing value:%n%s%n", packageData);
    }
}

class PackageData
{
    int number;
    String string;
    
    public PackageData()
    {
        number = 0;
        string = "Hello";
    }
    
    public String toString()
    {
        return String.format("number: %d; string: %s", number, string);
    }
}
