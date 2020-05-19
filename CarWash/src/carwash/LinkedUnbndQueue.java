/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carwash;

/**
 *
 * 
 */
public class LinkedUnbndQueue <T> implements UnboundedQueueInterface <T>
{
    protected LLNode <T> front;
    protected LLNode <T> rear;
    public int size;
    
    public LinkedUnbndQueue()
    {
        front = null;
        rear = null;
    }
    
    public void enqueue(T element)
    {
        LLNode<T> newNode = new LLNode<T>(element);
        if (rear == null)
        {
            front = newNode;
        }
        else
        {
            rear.setLink(newNode);
        }
        
        rear = newNode;
        size++; 
    }
    
    public T dequeue()
    {
        if(isEmpty())
        {
            throw new QueueUnderflowException("Dequeue attempted on empty queue!");
        }
        else
        {
            T element;
            element = front.getInfo();
            front = front.getLink();
            if (front == null)
            {
                rear = null;
            }
            size--;
            return element;
        }
    }
    
    public boolean isEmpty()
    {
        if (front == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
}
