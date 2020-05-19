/* 
 * Program: PezCandy
 * This: BoundedStackInterface.java
 * Author: Chad Nordstrom
 * Date: 2/22/2015
 * Purpose: To put candy in a pez dispenser and have..someone.. remove the yellow candies.
 */

package pez.candy;

/**
 *
 * @author Chad
 */
public interface BoundedStackInterface <T> extends StackInterface<T>
{
    void push(T element) throws StackOverflowException;
    //throws exception if this stack is full
    
    boolean isFull();
    //return true if the stack is full; otherwise false
    
    
    
}

