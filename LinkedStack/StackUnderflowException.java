/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedstack;

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
