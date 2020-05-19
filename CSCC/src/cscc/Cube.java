/*
 * Project: CSCC
 * This: cube.java
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

public class Cube 
{
    private double side;
    private double surface = 0.0;
    private double volume = 0.0;
    public Cube()
    {
        side = 0;
        getSide();
        calcCube();
        displayResults();
    }
    
    public Cube(double side)
    {
        this.side = side;
        calcCube();
        displayResults();
    }
    
    public void getSide()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of a side: ");
        this.side = input.nextDouble();
        System.out.print("\n");
    }
    
    private void calcCube()
    {
        final int CUBE_SIDES = 6;
        surface = side * side * CUBE_SIDES;
        volume = side * side * side;
    }
    
    private void displayResults()
    {
        System.out.printf("A cube with a %.2f side has a: ", side);
        System.out.printf("\nsurface area of %.2f square units and a ", surface);
        System.out.printf("volume of %.2f cubic units.\n", volume);
        
    }
            
}
