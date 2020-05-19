/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeapp;

/**
 *
 * @author CN276
 */
public interface BoundedStackInterface <T> extends StackInterface<T>
{
    void push(T element) throws StackOverflowException;
    //throws exception if this stack is full
    
    boolean isFull();
    //return true if the stack is full; otherwise false
    
    
    
}
