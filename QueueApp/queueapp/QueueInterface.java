/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queueapp;

/**
 *
 * @author CN276
 */
public interface QueueInterface <T>
{
    T dequeue() throws QueueUnderflowException;
    
    boolean isEmpty();
    
    
}
