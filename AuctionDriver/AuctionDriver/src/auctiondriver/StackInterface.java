/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auctiondriver;

/**
 *
 * @author dl153a
 */
public interface StackInterface<T>
{
    void pop() throws StackUnderflowException;
    
    T top() throws StackUnderflowException;
    
    boolean isEmpty();
    
    
}

