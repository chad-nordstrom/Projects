/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringlog;

/**
 *
 * @author CN276
 */
public interface StringLogInterface 
{
 String getName();// returns the name of the StringLog
 
 void insert(String elements);// places element into log
 // precondition: log may not be full
 
 boolean isFull();
 //returns True if the Log is full; false if it is not
 
 int size();
 // returns the number of Strings stored in the log
 
 void clear();
 //makes the log empty
 
 boolean contains(String element);
 //returns true if the element is in the log; false if it is not found
 //ignores case differences
 
 @Override
 String toString();
 //returns a nicely formatted string representing the StringLog
 
}
