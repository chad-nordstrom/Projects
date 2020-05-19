/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carwash;

/**
 *
 * 
 * 
 */
public interface UnboundedQueueInterface <T> extends QueueInterface <T>
{
    void enqueue(T element);
}

