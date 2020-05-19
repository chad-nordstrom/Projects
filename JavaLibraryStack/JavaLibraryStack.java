/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javalibrarystack;
import java.util.Stack;
/**
 *
 * @author CN276
 */
public class JavaLibraryStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("one");
        printStack(stack);
        stack.push("two");
        printStack(stack);
        stack.push("three");
        printStack(stack);
        
        //lets pop them off the stack
        
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
    }
    
    private static void printStack(Stack<String> s)
    {
        if (s.isEmpty())
        {
            System.out.println("Your stack is empty");
        }
        else 
        {
            System.out.printf("%s Top\n", s);
        }
    }
}
