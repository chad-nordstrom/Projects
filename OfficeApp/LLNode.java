/*
 * Project: CarWash
 * This: LLNode.java
 * Author: Dan Lontai, Chad Nordstrom, McLaughlin Holt
 * Date: 3-17-2015
 * Purpose: To set node links in our linked queue
 */

package officeapp;

/**
 *
 * 
 */
public class LLNode <T>
{
    private LLNode<T> link;
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
    
    public LLNode<T> getLink()
    {
        return link;
    }
}