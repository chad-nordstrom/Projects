/*
 * Project: CSCC
 * This: cscc.java
 * Date: 11/11/14
 * Author: Chad Nordstrom
 * Purpose: To calculate the the size of shapes.
*/
package cscc;

/**
 *
 * @author CN276
 */
import java.util.Scanner;
public class CSCC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number between 1-4 to choose which" +
                " object to use. Enter 1 for Cone, 2 for Cube, 3 for Cylinder" +
                " or 4 for Sphere.");
        int choice = input.nextInt();
        
        switch(choice)
        {
            case 1:
            {
                Cone myDunceHat = new Cone();
                break;
            }
            
            case 2:
            {
                Cube myCube = new Cube();
                break;
            }
            
            case 3:
            {
                Cylinder myCylinder = new Cylinder();
                break;
            }
            
            case 4:
            {
                Sphere mySphere = new Sphere();
                break;
            }
            
            default:
            {
                System.out.println("Invalid Choice.");
            }
        }
                
        
        
    }
}
