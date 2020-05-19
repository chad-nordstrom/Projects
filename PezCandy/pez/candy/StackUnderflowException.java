/* 
 * Program: PezCandy
 * This: StackUnderflowException.java
 * Author: Chad Nordstrom
 * Date: 2/22/2015
 * Purpose: To put candy in a pez dispenser and have..someone.. remove the yellow candies.
 */
package pez.candy;

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
