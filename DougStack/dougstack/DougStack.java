/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dougstack;

/**
 *
 * @author CN276
 */
import java.util.Scanner;

public class DougStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner conln = new Scanner(System.in);
        BoundedStackInterface<String> stack;
        //can also use ArrayStack
        stack = new ArrayStack<>(4);
        
        String line;//temporary stores data prior to putting in stack
        
        for (int index = 0; index <=3; index++)
        {
            System.out.print("Enter a line of text: ");
            line = conln.nextLine();
            stack.push(line);
        }
        
        System.out.println("\nReverse is: \n");
        while(!stack.isEmpty())
        {
            line = stack.top();
            stack.pop();
            System.out.println(line);
        }
        
    }
}
