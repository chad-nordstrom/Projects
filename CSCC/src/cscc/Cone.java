/*
 * Project: CSCC
 * This: cone.java
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
public class Cone {
    private double radius;
    private double height;
    private double surface = 0.0;
    private double volume = 0.0;
    public Cone()
    {
        radius = 0;
        getRadius();
        calcCone();
        displayResults();
    }
    
    public Cone(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
        calcCone();
        displayResults();
    }
    
    public void getRadius()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        this.radius = input.nextDouble();
        System.out.print("\n");
        
        System.out.print("Enter the height of the cone: ");
        this.height = input.nextDouble();
        System.out.print("\n");
    }
    
    private void calcCone()
    {
        
        surface =  Math.PI * radius * (radius + Math.sqrt((height * height) 
                + (radius * radius)));
        volume = Math.PI * radius * radius * height / 3.0;
    }
    
    private void displayResults()
    {
        System.out.printf("A cone with a %.2f unit radius"
                + " and a %.2f height has a: ", radius, height);
        System.out.printf("\nsurface area of %.2f square units and a ", surface);
        System.out.printf("volume of %.2f cubic units.\n", volume);
        
    }
}
