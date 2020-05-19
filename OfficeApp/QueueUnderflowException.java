/*
 * Project: CarWash
 * This: QueueUnderflowException.java
 * Author: Dan Lontai, Chad Nordstrom, McLaughlin Holt
 * Date: 3-17-2015
 * Purpose: queue underflow exception
 */

package officeapp;

/**
 *
 * 
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
