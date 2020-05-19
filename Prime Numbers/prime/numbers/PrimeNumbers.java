/*
 * Program: Prime Numbers
 * This: primenumbers.java
 * Date: 10/22/2014
 * Author: Chad Nordstrom
 * Purpose: To display the prime numbers that come before the number inputted.
 */
package prime.numbers;

/**
 *
 * @author CN276
 */
import java.util.Scanner;
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please Enter a number to find how many prime numbers come before it: ");
        int number = input.nextInt();
        
        PrimeGenerator myPrime = new PrimeGenerator(number);
    }
}
