/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dougstack;

/**
 *
 * @author CN276
 */
public interface StackInterface <T>
{
    void pop() throws StackUnderflowException;
    //throws exception if the stack is empty
    T top() throws StackUnderflowException;
    //throws exception if the stack is empty
    
    boolean isEmpty();
    //return true if the stack is empty
}
