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

public class VideoPoker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     PokerClass hand = new PokerClass();
     for (int d = 0; d <=4; d++)
     {
     System.out.println(hand.getCards());
     }
    }
}
