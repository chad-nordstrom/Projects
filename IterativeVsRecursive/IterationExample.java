/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativevsrecursive;

/**
 *
 * @author CN276
 */
public class IterationExample {
    private int baseInt;
    public int calcValue;
    
    public IterationExample(int factorInt)
    {
        this.baseInt = factorInt;
        this.calcValue = CalculateFactorial();
    }
    
    private int CalculateFactorial()
    {
        int value = baseInt;
        int retValue = 1;
        while(value !=0)
        {
            retValue = retValue * value;
            value = value -1;
        }
        return (retValue);
    }
    
}

