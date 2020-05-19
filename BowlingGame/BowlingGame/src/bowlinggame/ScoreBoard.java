/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bowlinggame;
import java.util.Scanner;
public class ScoreBoard {
    Scanner input = new Scanner(System.in);
    public int score = 0;
    public int strikes = 0;
    public int spares = 0;
    public int gutterballs = 0;
    public boolean frameOver = false;
    int shot2 = 0;
    String name;
    
    ScoreBoard(){
        
    }
    
    ScoreBoard(String name){
        this.name = name;
    }
    
    public void Shot1(){
        
        System.out.print("Pins knocked over: ");
        int shot1 = input.nextInt();
        
        if (shot1 == 0)
        {
            score = shot1 + score;
            gutterballs++;  
            Shot2();
        }
        else if(shot1 == 10)
        {
            score = shot1 + score;
            strikes++;
            frameOver = true;
            Strike();
           
        }
        else
        {
            score = shot1 + score;
            Shot2();
        }
        
    }
    
    public void Shot2()
    {
      System.out.print("Pins knocked over: ");
        int shot2 = input.nextInt();
        
        if (shot2 == 0)
        {
            score = shot2 + score;
            gutterballs++;  
             frameOver = true;
        }
        else if(shot2 == 10)
        {
            score = shot2 + score;
            spares++;
            frameOver = true;
            Spare();
        }
        else
        {
            score = shot2 + score;
            frameOver = true;
        }
        
        
        
        
    }
    
    public void Strike()
    {
        
        System.out.print("Pins knocked over: ");
        int shot3 = input.nextInt();
        
        int anArray[];
        
        
        
    }
    
    
    public void Spare(){
      
        
        
        
        
        
        
        
        
        
        
    }
    
    public String toString()
    {
        String myScore = name + "'s game after frame " + BowlingGame.frame + ": Score is "+ score +
            ", Strikes " + strikes + ", Spares " + spares + ", Gutter Balls " + gutterballs +
            "\n";
        return myScore;
    }
}
