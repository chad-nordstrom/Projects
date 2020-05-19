/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedqueue;

/**
 *
 * @author CN276
 */
public interface UnboundedQueueInterface <T> extends QueueInterface <T>
{
    void enqueue(T element);
}
