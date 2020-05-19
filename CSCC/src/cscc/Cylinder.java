/*
 * Project: CSCC
 * This: cylinder.java
 * Date: 11/11/14
 * Author: Chad Nordstrom
 * Purpose: To calculate the the size of shapes.
*/
package cscc;

import java.util.Scanner;

/**
 *
 * @author CN276
 */
public class Cylinder {
    private double radius;
    private double length;
    private double surface = 0.0;
    private double volume = 0.0;
    public Cylinder()
    {
        radius = 0;
        getRadius();
        calcCylinder();
        displayResults();
    }
    
    public Cylinder(double radius, double length)
    {
        this.radius = radius;
        this.length = length;
        calcCylinder();
        displayResults();
    }
    
    public void getRadius()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        this.radius = input.nextDouble();
        System.out.print("\n");
        
        System.out.print("Enter the length of the cylinder: ");
        this.length = input.nextDouble();
        System.out.print("\n");
    }
    
    private void calcCylinder()
    {
        
        surface = (2 * Math.PI * radius * length) + (2 * Math.PI * radius * radius);
        volume = Math.PI * radius * radius * length;
    }
    
    private void displayResults()
    {
        System.out.printf("A cylinder with a %.2f unit radius"
                + " and a %.2f length has a: ", radius, length);
        System.out.printf("\nsurface area of %.2f square units and a ", surface);
        System.out.printf("volume of %.2f cubic units.\n", volume);
        
    }
}
