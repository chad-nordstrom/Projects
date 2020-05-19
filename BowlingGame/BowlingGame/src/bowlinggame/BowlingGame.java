/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bowlinggame;
import java.util.Scanner;

public class BowlingGame {

    public static int frame;

    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);
//        ScoreBoard myScore = new ScoreBoard();
        
        System.out.print("Your name: ");
        String name = input.next();
        ScoreBoard myScore = new ScoreBoard(name);
        
        myScore.Shot1();
        
        while (frame < 10){
        if (myScore.frameOver == true)
        {
            frame++;
            System.out.print(myScore);
            myScore.Shot1();
        }
        }
      
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
