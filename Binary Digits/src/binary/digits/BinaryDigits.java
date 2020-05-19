/*
 * Program: BinaryDigits
 * This: findbinary.java
 * Date: 10/14/14
 * Author: Chad Nordstrom
 * Purpose: To find the binary translation of a number5
 */
package binary.digits;

/**
 *
 * @author CN276
 */
import java.util.Scanner;
public class BinaryDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner myIn = new Scanner(System.in);
        
        System.out.print("Please enter a digit so that the binaries for it can be found. ");
        int biNum = myIn.nextInt();
        System.out.println();
        FindBinary Remainder = new FindBinary(biNum);
    }
}
