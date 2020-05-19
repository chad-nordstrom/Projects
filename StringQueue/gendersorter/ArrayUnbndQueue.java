/*
 * Program: StringQueue
 * This: arrayunbndqueue.java
 * Author: Chad Nordstrom
 * Date: 3/18/15
 * Purpose: To have a user enter a name and gender and then sort them in their respective areas.
 */
package gendersorter;

/**
 *
 * @author CN276
 */
public class ArrayUnbndQueue<T> implements UnboundedQueueInterface<T>
{
    protected final int DEFCAP = 100;
    protected T[] queue;
    protected int numElements = 0;
    protected int front = 0;
    protected int rear = -1;
    protected int origCap;
    
    public ArrayUnbndQueue()
    {
        queue = (T[])new Object[DEFCAP];
        rear = DEFCAP - 1;
        origCap = DEFCAP;
    }
   public ArrayUnbndQueue(int origCap)
    {
        queue = (T[])new Object[origCap];
        rear = origCap - 1;
        this.origCap = origCap;
    }
   
   public void enlarge()
   {
   T[] larger = (T[]) new Object[queue.length + origCap];    
   
   // copy the contents from the smaller array into the larger array
   int currSmaller = front;
   for(int currLarger = 0; currLarger < numElements; currLarger++)
   {
       larger[currLarger]  = queue[currSmaller];
       currSmaller = (currSmaller + 1) % queue.length;
   }
   
   //update instance variables
   queue = larger;
   front  = 0;
   rear = numElements - 1;
   }
   
   public void enqueue(T element)
    //Adds element to the rear of this queue
   {
       if(numElements == queue.length)
       {
           enlarge();
       }
   
   else
   {
       rear = (rear + 1) % queue.length;
       queue[rear] = element;
       numElements++;
   }
   }
   
   public T dequeue()
    // Throws QueueUnderflowException if this queue is empty
    // Otherwise, removes front element from this queue and returns it
   {
       if(isEmpty())
       {
           throw new QueueUnderflowException("Dequeue attempted on empty queue");
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
   // Returns true if the queue is empty; otherwise, returns false
   {
       return (numElements == 0);
   }
   
 
}