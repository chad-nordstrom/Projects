/*
 * Project: CarWash
 * This: UnboundedQueueInterface.java
 * Author: Dan Lontai, Chad Nordstrom, McLaughlin Holt
 * Date: 3-17-2015
 * Purpose: Unbounded queue interface
 */

package officeapp;

/**
 *
 * 
 * 
 */
public interface UnboundedQueueInterface <T> extends QueueInterface <T>
{
    void enqueue(T element);
}

