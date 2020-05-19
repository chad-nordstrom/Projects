/*
 * Program: Presidents
 * This: unboundedstackinterface.java
 * Author: Chad Nordstrom
 * Date: 2/19/15
 * Purpose: To make a game of entering presidents names in the correct order and display the wrong answers.
 */
package presidents;

/**
 *
 * @author CN276
 */
public interface UnboundedStackInterface <T> extends StackInterface <T>
{
    void push(T element);
    
}
