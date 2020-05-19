/* 
 * Program: PezCandy
 * This: StackInterface.java
 * Author: Chad Nordstrom
 * Date: 2/22/2015
 * Purpose: To put candy in a pez dispenser and have..someone.. remove the yellow candies.
 */

package pez.candy;

/**
 *
 * @author Chad
 */
public interface StackInterface <T>
{
    void pop() throws StackUnderflowException;
    //throws exception if the stack is empty
    T top() throws StackUnderflowException;
    //throws exception if the stack is empty
    
    boolean isEmpty();
    //return true if the stack is empty
}
