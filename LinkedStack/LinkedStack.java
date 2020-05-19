/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedstack;

/**
 *
 * @author CN276
 */
import java.util.Scanner;

public class LinkedStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        LLStack<String> myStack;
        
        myStack = new LLStack<String>();
        
        boolean isFound = false;
        
        myStack.push("Spot");
        myStack.push("Sally");
        myStack.push("Dick");
        myStack.push("Jane");
        myStack.push("Puff");
        
        System.out.println(myStack.top() + "\n");
        System.out.print("Enter the name to look for ");
        String name = myInput.nextLine();
        
        while (!myStack.isEmpty())
        {
            if (name.equalsIgnoreCase(myStack.top()))
            {
                System.out.println(myStack.top() + "'s name was found!");
                isFound = true;

            }
            myStack.pop();
        }
        if(isFound == false)
        {
            System.out.println(name + " was not found in the stack!");
        }
    }
    
    
}
