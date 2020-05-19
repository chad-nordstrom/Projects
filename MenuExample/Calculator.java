/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menuexample;

/**
 *
 * @author CN276
 */
public class Calculator {
    private int num1;
    private int num2;
    public Calculator()
    {
        num1 = 0;
        num2 = 0;
    }
    public Calculator(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void setNumbers(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int getProduct()
    {
        return num1 * num2;
    }
    
    public int getSum()
    {
        return num1 + num2;
    }
    
    public int getDifference()
    {
        return num1 - num2;
    }
    
    
    
    public void doTable()
    {
        for (int row = 1; row <= num1; row++)
        {
            for (int col = 1; col <= num1; col++)
            {
                int product = row * col;
                System.out.printf("%d X %d = %d\n", row, col, product);
            }
        }
    }
}
