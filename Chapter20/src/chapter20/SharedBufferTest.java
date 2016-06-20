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

public class SharedBufferTest
{
    public SharedBufferTest() throws InterruptedException
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        
        Buffer sharedLocation = new UnsynchronizedBuffer();
        
        System.out.println("Action\t\tValue\tSum of Produced\tSum of Consumed");
        System.out.printf("------\t\t-----\t---------------\t---------------%n%n");
        
        executorService.execute(new Producer(sharedLocation));
        executorService.execute(new Consumer(sharedLocation));
        
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
    }
}
