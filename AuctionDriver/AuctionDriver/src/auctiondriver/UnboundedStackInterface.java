/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auctiondriver;

/**
 *
 * @author dl153a
 */
public interface UnboundedStackInterface<T> extends StackInterface<T> 
{
    void push(T element);
    
    
}