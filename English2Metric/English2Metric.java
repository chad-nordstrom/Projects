/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package english2metric;

/**
 *
 * @author CN276
 */

import java.util.Scanner;

public class English2Metric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Convert from, unit type; ");
        String userFrom = input.next();
        System.out.print("\n");
        
        System.out.print("Convert to, unit type; ");
        String userTo = input.next();
        System.out.print("\n");
        
        System.out.printf("How many %s do you want "
                + "to convert:", userFrom);
        double userAmount = input.nextDouble();
        System.out.print("\n");
        
        Converter myConv = new Converter();
        myConv.getUnits(userAmount);
        myConv.getFrom(userFrom);
        myConv.getTo(userTo);
        
    }
}
