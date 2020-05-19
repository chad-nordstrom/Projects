/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queueapp;

/**
 *
 * @author CN276
 */
import java.util.Scanner;

public class QueueApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner conIn = new Scanner(System.in);
        
        BoundedQueueInterface<String> queue;
        queue = new ArrayBndQueue<>(3);
        
        String line;
        
        for (int index = 1; index <= 3; index++)
        {
            System.out.print("Enter a line of text: ");
            line = conIn.next();
            queue.enqueue(line);
        }
        
        System.out.println("\nOrder is:\n");
        while(!queue.isEmpty())
        {
            line = queue.dequeue();
            System.out.println(line);
        }
        
    }
}
