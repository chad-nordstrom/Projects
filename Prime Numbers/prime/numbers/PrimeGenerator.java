/*
 * Program: Prime Numbers
 * This: primegenerator.java
 * Date: 10/22/2014
 * Author: Chad Nordstrom
 * Purpose: To display the prime numbers that come before the number inputted.
 */
package prime.numbers;

/**
 *
 * @author CN276
 */
public class PrimeGenerator 
{
    private int number = 0;
    
    private int remainder = 0;
    
    public PrimeGenerator()
    {
        
    }
    
    public PrimeGenerator(int number)
    {
        this.number = number;
        nextPrime();
    }
    
    public void nextPrime()
    {
        int num = 2;
        int count;
        for (count = 2; count <= number-1; count++) // to increase the number being divided
        {
            boolean notPrime = false;
            for (num = 2; num <= count-1; num++) // to increase the number that count is divided by
            {
                remainder = count % num;


                if (remainder == 0)
                {


                    num = count;
                    notPrime = true;
                    

                }

            }
            if (notPrime == true)
            {
                
            }
            else
            {
                System.out.println(count + " is prime.");
            }
            
        }  
    }
        
}