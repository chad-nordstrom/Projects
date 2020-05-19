/*
 * Program: BinaryDigits
 * This: findbinary.java
 * Date: 10/14/14
 * Author: Chad Nordstrom
 * Purpose: To find the binary translation of a number5
 */
package binary.digits;

/**
 *
 * @author CN276
 */
public class FindBinary 
{
    private int number = 0;
    private final int DIVIDE = 2;
    
    public FindBinary()
    {
        
    }
    
    public FindBinary(int number)
    {
        this.number = number;
        ModIt();
    }
    
    public void ModIt()
    {
        String digitString = "";
        do
        {
          int remainder = 0;
          remainder = number % DIVIDE;
   
          digitString = remainder + digitString;
           
          number = number / DIVIDE;
          
        } while (number != 0);
        System.out.print(digitString);
        System.out.println();
    }
}
