/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativevsrecursive;

/**
 *
 * @author CN276
 */
public class RecursiveExample{
        public int calcValue = 0;
    
    public RecursiveExample(int factorInt)
    {
        calcValue = CalculateRecursive(factorInt);
    }
    
    private int CalculateRecursive(int intRec)
    {
        if (intRec == 0)
        {
            return (1);
        }
        else
        {
            return (intRec * CalculateRecursive(intRec - 1));
        }
    }
    

}

    

