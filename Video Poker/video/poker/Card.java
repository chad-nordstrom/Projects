/* 
 * Program: Video Poker
 * This: card.java
 * Date: 11/5/14
 * Author: Chad Nordstrom
 * Purpose: To Make a deck of cards and shuffle them to get a hand of cards.
 */
package video.poker;

/**
 *
 * @author CN276
 */
public class Card {
    private int suitNum;
    private int cardNum;
    private String[] cards = 
    {
        "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
    };
    private String [] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    
    public Card(int suitNum, int cardNum) 
    {
        this.suitNum = suitNum;
        this.cardNum = cardNum;
    }
    
    @Override
    public String toString()
    {
        return cards[cardNum] + " of " + suits[suitNum];
    }
}
