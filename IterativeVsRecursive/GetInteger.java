/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativevsrecursive;

import java.util.Scanner;

/**
 *
 * @author dpeterson
 */
public class GetInteger {
    public int userInteger;
    
    public GetInteger()
    {
        getUserInput();
    }
    
    private void getUserInput()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter an integer to factor: ");
        
        boolean isValidInt = userInput.hasNextInt();
        
        if (isValidInt)
        {
            userInteger = userInput.nextInt();
            if (userInteger > 15)
            {
                System.out.println("The factorial fo this number would be too big for the \"int\" data type.");
                System.out.println("Input set to zero - factorial of 1");
                userInteger = 0;
            }
        }
        
    }
}

