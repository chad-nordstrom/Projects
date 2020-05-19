/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedstringlog;

/**
 *
 * @author CN276
 */
public class LLStringLog implements StringLogInterface{
    
    protected LLStringNode log;
    protected String name;
    
    // Constructor
    public LLStringLog(String name)
    {
        this.name = name;
        log = null;
    }
    
    public void insert(String element)
    {
        LLStringNode newNode = new LLStringNode(element);
        newNode.setLink(log);
        log = newNode;
    }
    
    public boolean isFull()
    {
        return false;
    }
    
    public int size()
    {
        int count = 0;
        LLStringNode node;
        node = log;
        while(node != null)
        {
            count++;
            node = node.getLink();
        }
        return count;
    }
    
    public boolean contains(String element)
    {
        LLStringNode node;
        node = log;
        while(node != null)
        {
            if(element.equalsIgnoreCase(node.getInfo()))
            {
                return true;
            }
            else
            {
                node = node.getLink();
            }
        }
        return false;
    }
    
    public void clear()
    {
        log = null;
    }
    
    public String getName()
    {
        return name;
    }
    
    @Override
    public String toString()
    {
        String logString = "Log:" + name + "\n\n";
        LLStringNode node;
        node = log;
        int count = 0;
        
        while (node != null)
        {
            count++;
            logString = logString + count + "." + node.getInfo() + "\n";
            node = node.getLink();
        }
        return logString;
    }
    
}
