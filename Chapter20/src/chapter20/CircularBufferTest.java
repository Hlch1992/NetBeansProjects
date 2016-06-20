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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CircularBufferTest
{
    public CircularBufferTest() throws InterruptedException
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        
        CircularBuffer sharedLocation = new CircularBuffer();
        
        sharedLocation.displayState("Initial State");
        
        executorService.execute(new Producer(sharedLocation));
        executorService.execute(new Consumer(sharedLocation));
        
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
    }
}
