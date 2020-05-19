/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menuexample;

/**
 *
 * @author CN276
 */

import java.util.Scanner;

public class MenuExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Calculator myCalc = new Calculator();
       
       char loopFlag = 'n'; // initialization
       
       do// this loop will always run @ least once
       {
           // process starts below
           System.out.print("Please enter first integer: ");
           int number1 = input.nextInt();
           System.out.print("\n");
           
           System.out.print("Please enter second integer: ");
           int number2 = input.nextInt();
           System.out.print("\n");
           
           myCalc.setNumbers(number1, number2);
           
           System.out.print("Please choose a menu item: ");
           System.out.print("\n 1.) Get Product" +
                   "\n 2.) Get Sum" +
                   "\n 3.) Get Difference" +
                   "\n 4.) Get Table \n\n");
           
           int choice = input.nextInt();
           
           switch(choice)
           {
               case 1:
               {
                   System.out.printf("The product of "
                           + " %d and %d is %d. \n" , number1, number2, myCalc.getProduct());
                   break;
               }
               case 2: 
               {
                   System.out.printf("The sum of "
                           + " %d and %d is %d. \n" , number1, number2, myCalc.getSum());
                   break;
               }
               case 3:
               {
                   
                   System.out.printf("The difference of "
                           + " %d and %d is %d. \n" , number1, number2, myCalc.getDifference());
                   break;
               
               }
               case 4:
               {
                   System.out.printf("The factors of "
                           + " %d and %d are: \n", number1, number2);
                   myCalc.doTable();
                   break;
               }
               default:
               {
                   System.out.println("Only 1 to 4 are valid. ");
               }
           }
           // incrementation
           System.out.print("\nEnter (y)es to quit: ");
           String contLoop = input.next().toLowerCase();
           loopFlag = contLoop.charAt(0);
           
       } while(loopFlag != 'y'); // test
           
    }
}
