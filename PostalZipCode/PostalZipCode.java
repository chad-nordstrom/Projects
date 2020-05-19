
/*
 * Project: Postal Zip Code
 * This: postalzipcode.java
 * Date: 11/13/14
 * Author: Chad Nordstrom
 * Purpose: To do get a zipcode and print the barcode associated with it and vice versa.
 */
package postalzipcode;

/**
 *
 * @author Chad
 */
import java.util.Scanner;
public class PostalZipCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner index = new Scanner(System.in);
        ToBarCode toBar = new ToBarCode();
        FromBarCode fromBar = new FromBarCode();
        int zipNum;
        String temp;
        System.out.println("Press 1 to convert a zipcode to a barcode." +
                " Press 2 to convert a barcode to a zipcode.");
        int choice = index.nextInt();
        
        switch(choice)
        {
            case 1:
            {
               zipNum = toBar.getZIP();
               System.out.print("The barcode is: ");
               toBar.getDigits(zipNum);
               System.out.println();
               break;
            }
            
            case 2:
            {
                 temp = fromBar.enterBar();
                 System.out.print("The zipcode is: ");
                 fromBar.divide(temp);
                 System.out.println();
                 break;
            }
        }
        
       
    }
    
}
