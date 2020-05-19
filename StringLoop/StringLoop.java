/*
 * Program: StringLoop
 * This: stringloop.java
 * Date: 10/15/14
 * Author: Chad Nordstrom
 * Purpose: To Enter a string and sort the contents based on user choice.
 */
package stringloop;

/**
 *
 * @author CN276
 */
import java.util.Scanner;

public class StringLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        
        StringFinder myString = new StringFinder(word);
       
           System.out.print("\n 1.) Get Uppercases" +
                   "\n 2.) Get Every Second Letter" +
                   "\n 3.) Remove Vowels" +
                   "\n 4.) Get Number of Vowels" +
                   "\n 5.) Find Positions of Vowels" +
                   "\n 6.) Enter 6 to quit. \n\n");
           
           int choice = input.nextInt();
           
           
          do
          {
           
           switch(choice)
           {
               case 1:
               {
                   myString.getUppercase();
                   break;
               }
               case 2: 
               {
                  myString.getSecond();
                   break;
               }
               case 3:
               {
                   myString.removeVowels();
                   
                   break;
               
               }
               case 4:
               {
                   myString.getVowelNum();
                   
                   break;
               }
               case 5:
               {
                   myString.getVowelPosition();
                   
                   break;
               }
               
               default:
               {
                   break;
               }
           }
           
           System.out.print("\nEnter 6 to exit program or 1-5 to use again: ");
           choice = input.nextInt();
          }while (choice !=6);
    }
}
           
 
