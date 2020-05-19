/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedqueue;

/**
 *
 * @author CN276
 */
public class QueueUnderflowException extends RuntimeException
{
    public QueueUnderflowException()
    {
        super();
    }
    
    public QueueUnderflowException(String message)
    {
        super(message);
    }
}
