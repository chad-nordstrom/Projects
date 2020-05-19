/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author CN276
 */
public class Recur {
    
    public Recur()
    {
        
    }
    
    public int fact(int number)
    {
        if (number <=1)
        {
            return 1; // base case
        }
        else
        {
            return number * fact(number - 1);
        }
    }
    //===============================================
    
    public int fact2(int number)
    {
        int product = 1;
        for (int index = 2; index <= number; index++)
        {
           product *= index; 
        }
        
        return product;
    }
    //==============================================
    
    public int power(int base, int exponent)
    {
        if (exponent == 0)
        {
            return 1; // base case
        }
        else
        {
            int subprogram = power(base, exponent - 1);
            return base * subprogram;
        }
        
        
    }
}
