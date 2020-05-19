/* 
 * Program: PezCandy
 * This: ArrayStack.java
 * Author: Chad Nordstrom
 * Date: 2/22/2015
 * Purpose: To put candy in a pez dispenser and have..someone.. remove the yellow candies.
 */

package pez.candy;

/**
 *
 * @author Chad
 */
public class ArrayStack <T> implements BoundedStackInterface<T>
{
    protected final int DEFCAP = 100;// default capacity of stack
    protected T[]stack;//holds stack elements
    protected int topIndex = -1;//index of top element in stack
    
    public ArrayStack()
    {
       stack = (T[]) new Object[DEFCAP];
    }
    
    public ArrayStack(int maxSize)
    {
        stack = (T[]) new Object[maxSize];
    }
    public void push(T element)
    {
        if (!isFull())
        {
            topIndex++;
            stack[topIndex] = element;
        }
        else
        {
            throw new StackOverflowException("Push attempted on a full stack!");
        }
    }
    
    public boolean isFull()
    {
        if (topIndex == (stack.length - 1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void pop()
    {
        if (!isEmpty())
        {
            stack[topIndex] = null;
            topIndex--;
        }
        else
        {
            throw new StackUnderflowException("Pop attempted on an empty stack!");
        }
    }
    
    public T top() 
    {
        T topOfStack = null;
        if (!isEmpty())
        {
            topOfStack = stack[topIndex];
        }
        else 
        {
            throw new StackUnderflowException("Top attempted on an empty stack!");
        }
        return topOfStack;
    }
    
    public boolean isEmpty()
    {
        if (topIndex == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
