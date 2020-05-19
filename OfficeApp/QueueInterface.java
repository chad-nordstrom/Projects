/*
 * Project: CarWash
 * This: QueueInterface.java
 * Author: Dan Lontai, Chad Nordstrom, McLaughlin Holt
 * Date: 3-17-2015
 * Purpose: Interface for our queues.
 */

package officeapp;

/**
 *
 * 
 */
public interface QueueInterface <T>
{
    T dequeue() throws QueueUnderflowException;
    
    boolean isEmpty();
}
