/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedstack;

/**
 *
 * @author CN276
 */
public interface StackInterface <T>
{
    void pop() throws StackUnderflowException;
    
    T top() throws StackUnderflowException;
    
    boolean isEmpty();
    
    
}
