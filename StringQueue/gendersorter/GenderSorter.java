/*
 * Program: StringQueue
 * This: gendersorter.java
 * Author: Chad Nordstrom
 * Date: 3/18/15
 * Purpose: To have a user enter a name and gender and then sort them in their respective areas.
 */
package gendersorter;

import java.util.Scanner;

/**
 *
 * @author CN276
 */
public class GenderSorter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gender myGen = new Gender();
        Scanner myIn = new Scanner(System.in);
        int choice = 0;
        
        
        System.out.println("Welcome to the Gender Sorter, for all your gender sorting needs."
                + "\n Please Enter 1 to insert males or females into the sorter."
                + "\n Enter 2 to sort the names."
                + "\n Enter 3 to exit the program.");
        
        while (choice != 3)
        {
        System.out.println("Please Enter 1, 2, or 3.");
        choice = myIn.nextInt();
        
        switch(choice)
        {
            case 1:
            {
                myGen.genderSorter();
                break;
            }
                
            case 2:
            {
                
                myGen.printList();
                break;
            }
                
            case 3:
            {
                System.out.println("Thank you for using the gender sorter!"
                        + "\nHave a good day!");
                break;
            }
        } 
                
        }
        
        
//        for (int index = 1; index <= 10; index++)
//        {
//            System.out.print("Enter a line of text: ");
//            line = conIn.next();
//            myQueue.enqueue(line);
//        }
//        
//        System.out.println("\nOrder is:\n");
//        while(!myQueue.isEmpty())
//        {
//            line = myQueue.dequeue();
//            System.out.println(line);
//        }
    }
}
