/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author CN276
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Recur myMath = new Recur();
        System.out.println(myMath.fact(5));
        System.out.println(myMath.fact2(5));
        System.out.println(myMath.power(10, 3));  
    }
}
