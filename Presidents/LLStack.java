/*
 * Program: Presidents
 * This: llstack.java
 * Author: Chad Nordstrom
 * Date: 2/19/15
 * Purpose: To make a game of entering presidents names in the correct order and display the wrong answers.
 */
package presidents;

/**
 *
 * @author CN276
 */
public class LLStack <T> implements UnboundedStackInterface <T>
{
      protected LLNode <T> top;
    
    public LLStack()
    {
        top = null;
    }
    
    public void push(T element)
    {
        LLNode<T> newNode = new LLNode<T>(element);
        newNode.setLink(top);
        top = newNode;
    }
    
    public void pop()
    {
        if (!isEmpty())
        {
            top = top.getLink();
        }
        else
        {
            throw new StackUnderflowException("Pop attempted on an empty stack!");
                    
        }
    }
    
    public boolean isEmpty()
    {
        if (top == null)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    public T top()
    {
        if (!isEmpty())
        {
            return top.getInfo();
        }
        else
        {
            throw new StackUnderflowException("Top attempted on an empty stack!");
        }
    }
    
   
}
