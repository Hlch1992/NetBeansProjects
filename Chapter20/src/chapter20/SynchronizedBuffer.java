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
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public class SynchronizedBuffer implements Buffer
{

    private final Lock accessLock = new ReentrantLock();

    private final Condition canWrite = accessLock.newCondition();
    private final Condition canRead = accessLock.newCondition();

    private int buffer = -1;
    private boolean occupied = false;

    public synchronized void blockingPut(int value) throws InterruptedException
    {
        accessLock.lock();

        try
        {
            while (occupied)
            {
                System.out.println("Producer tries to write.");
                displayState("Buffer full. Producer waits.");
                canWrite.await();
//            wait();
            }

            buffer = value;

            occupied = true;

            displayState("Producer writes " + buffer);

            canRead.signalAll();

//            notifyAll();
        } finally
        {
            accessLock.unlock();
        }
    }

    public /*synchronized*/ int blockingGet() throws InterruptedException
    {
        int readValue = 0;
        accessLock.lock();

        try
        {
            while (!occupied)
            {
                System.out.println("Consumer tries to read.");
                displayState("Buffer empty. Consumer waits.");
                canRead.await();
//                wait();
            }

            occupied = false;

            displayState("Consumer reads " + buffer);
            
            canWrite.signalAll();

//            notifyAll();
        }
        finally
        {
            accessLock.unlock();
        }
        
        return readValue;

//        return buffer;
    }

    private /*synchronized*/ void displayState(String operation)
    {
        try
        {
            accessLock.lock();
            System.out.printf("%-40s%d\t\t%b%n%n", operation, buffer, occupied);
        }
        finally
        {
            accessLock.unlock();
        }
    }
}
