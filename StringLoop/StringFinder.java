/*
 * Program: StringLoop
 * This: stringFinder.java
 * Date: 10/15/14
 * Author: Chad Nordstrom
 * Purpose: To Enter a string and sort the contents based on user choice.
 */
package stringloop;

/**
 *
 * @author CN276
 */
public class StringFinder 
{
    private String oneString = "";
    private String uppers = "ABCDEFGHIJKLMNOPQRSTUV";
    private String vowels = "aeiouyAEIOUY";
    
    public StringFinder()
    {
        
    }
    
    public StringFinder(String oneString)
    {
        this.oneString = oneString;
        
    }
    
    public void getUppercase()
    {
        
           //System.out.println(oneString);
           //System.out.println(uppers.substring(0, 1));
           
           int count = oneString.length()-1;
           System.out.print("Uppercase letters are: ");
           for(int index = 0; index <= count ; index++)
           {
               
              if(uppers.contains(oneString.substring(index,index+1)))
             {
                 
                  System.out.print(oneString.charAt(index));
                  
              }
              
           }
           System.out.println();
           
           
             
           
        }
    public void getSecond()
    {
        int count = oneString.length()-1;
        
        System.out.print("Every second letter of that word are as follows: ");
        for(int index = 0; index <= count ; index = index + 2)
        {
            System.out.print(oneString.charAt(index));
        }
        System.out.println();
    }
    
    public void removeVowels()
    {
        int count = oneString.length()-1;
        
        for(int index = 0; index <= count ; index++)
        {
            if(vowels.contains(oneString.substring(index,index+1)))
            {
                System.out.print("_");
                
            }
            else
            {
                System.out.print(oneString.charAt(index));
            }
           
        } 
        System.out.println();
    }
    public void getVowelNum()
    {
        int vowelNum = 0;
        int count = oneString.length()-1;
        
        for(int index = 0; index <= count ; index++)
        {
             
            if(vowels.contains(oneString.substring(index,index+1)))
            {
                vowelNum++;
                
            }
        }
        System.out.print("There are " + vowelNum + " vowels.");
        System.out.println();
    }
    
    public void getVowelPosition()
    {
        int count = oneString.length()-1;
        
        System.out.print("The Vowels are in these Positions: ");
        for(int index = 0; index <= count ; index++)
        {
            if(vowels.contains(oneString.substring(index,index+1)))
            {
               System.out.print(index + " ");
                
            }
        }
        
    }
    
}
