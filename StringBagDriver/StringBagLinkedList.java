/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbagdriver;
import java.util.Random;
/**
 *
 *
 */
public class StringBagLinkedList implements StringBagInterface {

   protected StringBagNode log;
   protected String name;
   protected String returnString = "";
    
    //constructor
   public StringBagLinkedList(String name) {
       log = null;
       this.name = name;
       int userChoice = 0;
   }
        
    // Adds elements to the bag
    public void insert(String info) {
        StringBagNode newNode = new StringBagNode(info);
        newNode.setLink(log);
        log = newNode;
    }
    // Removes elements from the bag at random
     public String remove() {
           Random generator = new Random();
            
           int removeAt = generator.nextInt(size());
            
           System.out.println("Removing at " + removeAt);
           
           return remove(removeAt);
   }
   
  @Override
    // Assists remove method
   public String remove(int userChoice){
          StringBagNode currentNode = log;
          StringBagNode prevNode = log;
          
          
         
          if (userChoice < this.size() && userChoice > 0 ) { // Keeps track of position on the list
                  int currentCounter = 0;                    // checks if it is the choice and if not 
                  while(currentCounter != userChoice) {      // resets link till it reaches choice
                          currentCounter++;
                          prevNode = currentNode;
                          currentNode = currentNode.link;
                  }
                  returnString =  currentNode.getInfo();
                  prevNode.link = currentNode.link;
                  currentNode = null;
          } else if (userChoice == 0 && log != null) {
                  returnString = log.getInfo();
                  log = log.link;
          }
          
         
           
           return returnString;
   }
    

    public void clear() {
       clear(this.log);
       log = null;
    } 

    public void clear(StringBagNode node) {
        if (node.link != null) {
            clear(this.log);
        }
    }

    public boolean isEmpty() {
        return false;
    }
    
    // size of the list
    public int size(){
        int count = 0;
        StringBagNode node;
        node = log;
        while(node != null){
            count++;
            node = node.getLink(); 
        }
        return count; 
    }

    @Override
    // returns nicely formatted String
    public String toString() {
        String logString = "Log:" + name + "\n\n";
        StringBagNode node;
        node = log;
        int count = 0;

        while (node != null) {
            count++;
            logString = logString + count
                    + "." + node.getInfo() + "\n";
            node = node.getLink();
        }
        return logString;

    }

}
