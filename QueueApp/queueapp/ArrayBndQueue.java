/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queueapp;

/**
 *
 * @author CN276
 */
public class ArrayBndQueue <T> implements BoundedQueueInterface<T>
{
    protected final int DEFCAP = 100;
    protected T[] queue;
    protected int numElements = 0;
    protected int front = 0;
    protected int rear = 0;
    
    public ArrayBndQueue()
    {
        queue = (T[])new Object[DEFCAP];
        rear = DEFCAP - 1;
    }
    
    public ArrayBndQueue(int maxSize)
    {
        queue = (T[])new Object[maxSize];
        rear = maxSize - 1;
    }
    
    public void enqueue(T element)
    {
        if (isFull())
        {
            throw new QueueOverflowException("Enqueue attempted on full queue.");
        }
        else
        {
            rear = (rear + 1) % queue.length;
            queue[rear] = element;
            numElements++;
        }
    }
    
    public T dequeue()
    {
        if (isEmpty())
        {
            throw new QueueUnderflowException("Dequeue attempted on empty queue.");
        }
        else
        {
            T toReturn = queue[front];
            queue[front] = null;
            front = (front + 1) % queue.length;
            numElements--;
            return toReturn;
        }
    }
    
    public boolean isEmpty()
    {
        return (numElements == 0);
    }
    
    public boolean isFull()
    {
        return (numElements == queue.length);
    }
}
