/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedqueue;

/**
 *
 * @author CN276
 */
public class QueueOverflowException extends RuntimeException
{
    public QueueOverflowException()
    {
        super();
    }
    
    public QueueOverflowException(String message)
    {
        super(message);
    }
}
