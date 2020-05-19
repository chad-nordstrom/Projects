/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativevsrecursive;

/**
 *
 * @author CN276
 */
import java.util.Scanner;
public class IterativeVsRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner menuItem = new Scanner(System.in);
        String choice = "0";
        GetInteger myInteger;
        int factorInt = 0;
        
        do
        {
            System.out.print("Select your menu item - " +
                    "\n1 - Enter integer (15 or less)" +
                    "\n2 - Display using iteration" +
                    "\n3 - Display using recursion" +
                    "\n0 - Exit the program");
            
            System.out.println();
            choice = menuItem.next();
            
            switch(choice)
            {
                case "0":
                {
                   System.out.print("Exiting program!");
                   break;
                }
                case "1":
                {
                    myInteger = new GetInteger();
                    factorInt = myInteger.userInteger;
                    System.out.println("The number to fact is: " + factorInt);
                    break;
                }
                case "2":
                {
                    IterationExample myIter = new IterationExample(factorInt);
                    int iterFactor = myIter.calcValue;
                    System.out.println("The factor for " + factorInt + " is " + iterFactor);
                    break;
                    
                }
                case "3":
                {
                    RecursiveExample myRecur = new RecursiveExample(factorInt);
                    int recurFactor = myRecur.calcValue;
                    System.out.println("The factor for " + factorInt + " is " + recurFactor);
                    break;
                }
                default:
                {
                    System.out.println("Invalid Entry!");
                }
            }
        }while(!choice.equalsIgnoreCase("0"));
    }
}

