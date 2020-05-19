/* 
 * Program: Video Poker
 * This: pokerclass.java
 * Date: 11/5/14
 * Author: Chad Nordstrom
 * Purpose: To Make a deck of cards and shuffle them to get a hand of cards.
 */
package video.poker;

/**
 *
 * @author CN276
 */
import java.util.Random;
import java.util.ArrayList;
public class PokerClass 
{
     private ArrayList<Card> cards;
    
    
    
    public PokerClass()
    {
       cards = new ArrayList<>(52);
       for(int s =0; s <=3; s++)
       {
           for (int c=0; c<=12; c++)
           {
               cards.add(new Card(s,c));
           }
       }
       
        getCards();
    }
    
    public Card getCards()
    {
       Random shuffle = new Random();
       
       
       
       int cardRandom = shuffle.nextInt(cards.size());
       
       
       
       return cards.remove(cardRandom);
      

    }
    
}
