/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carwash;

/**
 *
 * 
 */
public interface QueueInterface <T>
{
    T dequeue() throws QueueUnderflowException;
    
    boolean isEmpty();
}
