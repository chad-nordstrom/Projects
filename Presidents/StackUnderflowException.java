/*
 * Program: Presidents
 * This: stackunderflowexception.java
 * Author: Chad Nordstrom
 * Date: 2/19/15
 * Purpose: To make a game of entering presidents names in the correct order and display the wrong answers.
 */
package presidents;

/**
 *
 * @author CN276
 */
public class StackUnderflowException extends RuntimeException
{
    public StackUnderflowException()
    {
      super();   
    }
    
    public StackUnderflowException(String message)
    {
      super(message);   
    }
   
    
}
