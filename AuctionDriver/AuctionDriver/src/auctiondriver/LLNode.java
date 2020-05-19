/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auctiondriver;

/**
 *
 * @author dl153a
 */
public class LLNode<T> 
{
    private LLNode<T> link;
    private T info;
    
    public LLNode(T info){
        this.info = info;
        link = null;
    }
    
    public void setInfo(T info){
        this.info = info;
    }
    
    public T getInfo(){
       return info; 
    }
    
    public void setLink(LLNode<T>link){
        this.link = link;
    }
    
    public LLNode<T>getLink(){
        return link;
    }
    
    
}