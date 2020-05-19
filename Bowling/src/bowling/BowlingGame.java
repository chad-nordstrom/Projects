/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bowling;

/**
 *
 * @author Chad
 */
public class BowlingGame 
{
    private String name = "";
    private final int PINTOTAL = 10;
    
    private int strikeCount = 0;
    private int spareCount = 0;
    private int gutterCount = 0;
    private int frameScore = 0;
    private int totalScore = 0;
    private int[] ScoreArray;
    
    
    public BowlingGame(String name)
    {
        this.name = name;
        ScoreArray = new int[22];
    }
    
    public void shot(int firstThrow, int secThrow)
    {
        
        int firstThrowRemCount = 0; 
        int secThrowRemCount = 0;
        
        
        
        
        firstThrowRemCount = PINTOTAL - firstThrow; // amount of pins remaining after first hit
        boolean nextAttempt = false; // to allow second throw
        boolean strike = false; 
        boolean spare = false;
        
        if (firstThrowRemCount == 0)
        {
            strikeCount++;
            strike = true; 
        }
        else if (firstThrowRemCount == 10)
        {
            gutterCount++;
            nextAttempt = true;
        }
        else 
        {
            nextAttempt = true;
        }
        
        // *********************************************************************
        
        if (nextAttempt = true)
        {
            if (secThrow + firstThrowRemCount > PINTOTAL)
            {
                System.out.println("Error, invalid amount. Re-enter.");
            }
            else
            {
                
            secThrowRemCount = firstThrowRemCount - secThrow; // amount remaining after second hit
            
            if (secThrowRemCount == 0)
            {
                spareCount++;
                spare = true;
            }
            else if (secThrowRemCount == firstThrowRemCount)
            {
               gutterCount++;
            }
            else
            {
               frameScore = firstThrow + secThrow; 
            }
                    
            }
        }
        
        
        
       if (strike = true)
       {
           
           frameScore = 
       }
        
        
        
          
    }
    
 
   
    
}
