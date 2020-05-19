/*
 * Program: StringQueue
 * This: unboundqueueinterface.java
 * Author: Chad Nordstrom
 * Date: 3/18/15
 * Purpose: To have a user enter a name and gender and then sort them in their respective areas.
 */
package gendersorter;

/**
 *
 * @author CN276
 */
public interface UnboundedQueueInterface <T> extends QueueInterface <T>
{
    void enqueue(T element);
}
