/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

/**
 *
 * @author Hlch1
 */
public class UnsynchronizedBuffer implements Buffer
{
    private int buffer = -1;
    
    public void blockingPut(int value) throws InterruptedException
    {
        System.out.printf("Producer writes\t%2d", value);
        buffer = value;
    }
    
    public int blockingGet() throws InterruptedException
    {
        System.out.printf("Consumer reads\t%2d", buffer);
        return buffer;
    }
}
