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
import java.security.SecureRandom;

public class Producer implements Runnable
{
    private static final SecureRandom generator = new SecureRandom();
    private final Buffer sharedLocation;
    
    public Producer(Buffer sharedLocation)
    {
        this.sharedLocation = sharedLocation;
    }
    
    public void run()
    {
        int sum = 0;
        
        for (int count = 1; count <= 10; count ++)
        {
            try 
            {
                Thread.sleep(generator.nextInt(3000));
                sharedLocation.blockingPut(count);
                sum += count;
                System.out.printf("\t%2d%n", sum);
            }
            catch (InterruptedException exception)
            {
                Thread.currentThread().interrupt();
            }
        }
        
        System.out.printf("Producer done producing%nTerminating Producer%n");
    }
}
