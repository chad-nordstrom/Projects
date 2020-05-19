/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queueapp;

/**
 *
 * @author CN276
 */
public interface BoundedQueueInterface <T> extends QueueInterface <T>
{
    void enqueue(T element) throws QueueOverflowException;
    
    boolean isFull();
}
