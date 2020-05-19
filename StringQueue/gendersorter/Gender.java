/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gendersorter;

/**
 *
 * @author CN276
 */
import java.util.Scanner;
public class Gender {
    
    UnboundedQueueInterface <String> mQueue = new ArrayUnbndQueue();
    UnboundedQueueInterface <String> fQueue = new ArrayUnbndQueue();
    Scanner myIn = new Scanner(System.in);
    
    public Gender()
    {

    }

    public void genderSorter()
    {
        String line = "";
        System.out.println("Enter a gender and name in this format, i.e.: f Jasmine or m Chad."
                + "Enter x done to exit to menu.");
        
        do 
        {
        line = myIn.nextLine();
        if (line.charAt(0) == 'f')
        {
            
            fQueue.enqueue(line.substring(2));
        }
        else if (line.charAt(0) == 'm')
        {
            
            mQueue.enqueue(line.substring(2));
        }
        
        }while (line.charAt(0) != 'x');
    }
    
    public void printList()
    {
        if (fQueue.isEmpty() || mQueue.isEmpty())
        {
            System.out.println("Sorry. Either no names have been entered,"
                    + " or you have only entered names of a single gender. "
                    + "\nPlease enter names and genders first.");
        }
        else
        {
        System.out.print("Males are: ");
        do 
        {
        
        System.out.print(mQueue.dequeue() + " ");
        } while (!mQueue.isEmpty());
        
        System.out.print("\nFemales are: ");
        do
        {
        
        System.out.print(fQueue.dequeue() + " ");
        } while (!fQueue.isEmpty());
        System.out.println("\n");
        }
    }
}
