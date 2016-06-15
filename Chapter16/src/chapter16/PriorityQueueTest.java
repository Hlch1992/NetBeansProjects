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
import java.util.PriorityQueue;

public class PriorityQueueTest
{
    public PriorityQueueTest()
    {
        PriorityQueue<Double> queue = new PriorityQueue<>();
        
        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);
        
        System.out.print("Polling from queue: ");
        
        while (queue.size() > 0)
        {
            System.out.printf("%.1f ",queue.peek());
            queue.poll();
        }
        
        System.out.println();
    }
}
