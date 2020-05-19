/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auctiondriver;

import java.util.Scanner;

/**
 *
 * @author dl153a
 */
public class AuctionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name = "";

        Scanner keyboard = new Scanner(System.in);
        
        LLStack<Integer> bidStack = new LLStack();
        LLStack<Integer> compStack = new LLStack();
        LLStack<Integer> lowBidStack = new LLStack();
        LLStack<String> nameStack = new LLStack();
        //LLStack<String> compNameStack = new LLStack();

        boolean end = false;
        int choice = 0;

        
        String highBidder = "";
        String result = "";
        int highBid = 0;
        int compareBid = 0;
        

        System.out.println("Welcome to Java auction!");
        System.out.println("What item would you like to bid for?");
        String item = keyboard.next();
        
        
        
        
        do{
        
        System.out.println("Enter 1 to create the first bid.");
        System.out.println("Enter 2 to create another bids.");
        System.out.println("Enter 3 to finish the auction.");

         choice = keyboard.nextInt();
        
        
        

        switch (choice) {
            case 1:
                
                System.out.println("Please enter your name: ");
                name = keyboard.next();

                nameStack.push(name);
                
                System.out.println("Please enter your bid");

                highBid = keyboard.nextInt();
                
                bidStack.push(highBid);
                
                highBidder = nameStack.top();
                result = "New High Bidder";
                
                lowBidStack.push(1);
                
                
                System.out.println("New Bid: $" + bidStack.top() + " " + nameStack.top() + "      Result: " + result + "     High Bidder: " + highBidder + "     Low Bid: $" + lowBidStack.top() + "     Max Bid: $" + bidStack.top());
               
                
                break;
            
            case 2:
               
                System.out.println("Please enter your name: ");
                name = keyboard.next();

                nameStack.push(name);
                
                System.out.println("Please enter your bid");

                compareBid = keyboard.nextInt();
                compStack.push(compareBid);
                
                if (compStack.top() > bidStack.top())
                {
                    
                    result = "New High Bidder";
                    
                  
                    lowBidStack.push(bidStack.top() + 1);

                    highBidder = name;
                    
                    System.out.println("New Bid: $" + compStack.top() + " " + nameStack.top() + "     Result: " + result + "     High Bidder: " + highBidder + "     Low Bid: " + lowBidStack.top() +    "     Max Bid: " + compStack.top());

                    
                    bidStack.push(compStack.top());
                    
                    
                    
                    
                }
                else if (compStack.top() < bidStack.top() || compStack.top() == bidStack.top())
                {
                    result = "No Change";
                    
                    
                    System.out.println("New Bid: $" + compStack.top() + " " + nameStack.top() + "     Result: " + result + "     High Bidder: " + highBidder + "     Low Bid: $" + lowBidStack.top() +    "     Max Bid: $" + compStack.top());
                    
                }
               
                break;
            case 3:
                System.out.println(highBidder + " won " + item + " for $" + lowBidStack.top());
                
                
             end = true;
                break;



        }
        }while(end == false);
    }
    
}
