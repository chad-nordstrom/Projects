/* 
 * Program: PezCandy
 * This: StackOverflowException.java
 * Author: Chad Nordstrom
 * Date: 2/22/2015
 * Purpose: To put candy in a pez dispenser and have..someone.. remove the yellow candies.
 */
package pez.candy;

/**
 *
 * @author CN276
 */
public class StackOverflowException extends RuntimeException
{
    public StackOverflowException()
    {
        super();
    }
    public StackOverflowException(String message)
    {
        super(message);
    }
}
