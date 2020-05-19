/*
 * Project: CSCC
 * This: sphere.java
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
public class Sphere {
    private double radius;
    private double surface = 0.0;
    private double volume = 0.0;
    public Sphere()
    {
        radius = 0;
        getRadius();
        calcSphere();
        displayResults();
    }
    
    public Sphere(double radius)
    {
        this.radius = radius;
        calcSphere();
        displayResults();
    }
    
    public void getRadius()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the radius: ");
        this.radius = input.nextDouble();
        System.out.print("\n");
    }
    
    private void calcSphere()
    {
        
        surface = 4.0 * Math.PI* radius * radius;
        volume = 4.0 / 3.0 * Math.PI * radius * radius * radius;
    }
    
    private void displayResults()
    {
        System.out.printf("A Sphere with a %.2f unit radius has a: ", radius);
        System.out.printf("\nsurface area of %.2f square units and a ", surface);
        System.out.printf("volume of %.2f cubic units.\n", volume);
        
    }
            
}

