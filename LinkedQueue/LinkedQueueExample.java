/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedqueue;

/**
 *
 * @author CN276
 */
public class LinkedQueueExample extends LinkedUnbndQueue{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedUnbndQueue myQueue = new LinkedUnbndQueue();
        
        myQueue.enqueue(4);
        myQueue.enqueue(4.5);
        myQueue.enqueue(true);
        myQueue.enqueue("Doug");
        myQueue.enqueue("Ralph");
        
        System.out.println("There are " + myQueue.size + " elements in my queue.");
        
        int num1 = (int)(myQueue.front.getInfo());
        System.out.println("The first element is " + num1);
        myQueue.dequeue();
        
        double num2 = (double)(myQueue.front.getInfo());
        System.out.println("The second element is " + num2);
        myQueue.dequeue();
        
        boolean isFlag = (boolean)(myQueue.front.getInfo());
        System.out.println("The third element is " + isFlag);
        myQueue.dequeue();
        
        String name1 = (String)(myQueue.front.getInfo());
        System.out.println("The fourth element is " + name1);
        myQueue.dequeue();
        
        String name2 = (String)(myQueue.front.getInfo());
        System.out.println("The fifth element is " + name2);
        myQueue.dequeue();
        
        
    }
}
