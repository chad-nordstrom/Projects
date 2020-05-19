/*
 * Program: Presidents
 * This: llnode.java
 * Author: Chad Nordstrom
 * Date: 2/19/15
 * Purpose: To make a game of entering presidents names in the correct order and display the wrong answers.
 */
package presidents;

/**
 *
 * @author CN276
 */
public class LLNode <T>{
     private LLNode <T> link;
    private T info;
    
    public LLNode(T info)
    {
        this.info = info;
        link = null;
    }
    
    public void setInfo(T info)
    {
        this.info = info;
    }
    
    public T getInfo()
    {
        return info;
    }
    
    public void setLink(LLNode<T> link)
    {
        this.link = link;
    }
    
    public LLNode <T> getLink()
    {
        return link;
    }
    
}
