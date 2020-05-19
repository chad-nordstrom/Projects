/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeapp;

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
