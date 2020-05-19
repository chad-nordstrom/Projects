/* 
 * Program: PezCandy
 * This: pezcandy.java
 * Author: Chad Nordstrom
 * Date: 2/22/2015
 * Purpose: To put candy in a pez dispenser and have..someone.. remove the yellow candies.
 */
package pez.candy;

/**
 *
 * @author CN276
 */

import java.util.Random;
public class PezCandy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int max = 5;
        int min = 1;
        BoundedStackInterface<String> pezStart;
        BoundedStackInterface<String> pezEnd;
        pezStart = new ArrayStack<>(10);
        pezEnd = new ArrayStack<>(10);
        Random rand = new Random();
        String line;
        
        
        
        
        for (int count = 0; count < 10; count++)
        {
        int choser = rand.nextInt((max - min) + 1) + min;

        
        if (choser == 1)
        {
            pezStart.push("Yellow");
        }
        if (choser == 2)
        {
            pezStart.push("Red");
            pezEnd.push("Red");
        }
        if (choser == 3)
        {
            pezStart.push("Purple");
            pezEnd.push("Purple");
        }
        if (choser == 4)
        {
            pezStart.push("Green");
            pezEnd.push("Green");
        }
        if (choser == 5)
        {
            pezStart.push("Blue");
            pezEnd.push("Blue");
        }
        }
        System.out.println("An unassuming pez dispenser contains these candies:\n");
        while(!pezStart.isEmpty())
        {
            
            line = pezStart.top();
            pezStart.pop();
            System.out.println(line);
        }
        System.out.println("\nAfter the villain Doug got ahold of the pez dispenser it contains these candies:\n");
        while(!pezEnd.isEmpty())
        {
            line = pezEnd.top();
            pezEnd.pop();
            System.out.println(line);
        }
        System.out.println("\nSuspicious, no?");
        
    }
}

