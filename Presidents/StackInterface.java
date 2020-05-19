/*
 * Program: Presidents
 * This: stackinterface.java
 * Author: Chad Nordstrom
 * Date: 2/19/15
 * Purpose: To make a game of entering presidents names in the correct order and display the wrong answers.
 */
package presidents;

/**
 *
 * @author CN276
 */
public interface StackInterface <T>{
       void pop() throws StackUnderflowException;
    
    T top() throws StackUnderflowException;
    
    boolean isEmpty();
    
    
}
