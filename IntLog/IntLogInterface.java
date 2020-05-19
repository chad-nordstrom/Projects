/*
 * Program: IntLog
 * This: intloginterface.java
 * Author: Chad Nordstrom
 * Date: 5/4/15
 * Purpose: To generate random numbers until numbers are duplicated.
 */
package intlog;

/**
 *
 * @author CN276
 */
public interface IntLogInterface {
    String getName();// returns the name of the StringLog
 
 void insert(int elements);// places element into log
 // precondition: log may not be full
 
 boolean isFull();
 //returns True if the Log is full; false if it is not
 
 int size();
 // returns the number of Strings stored in the log
 
 void clear();
 //makes the log empty
 
 boolean contains(int element);
 //returns true if the element is in the log; false if it is not found
 //ignores case differences
 
 @Override
 String toString();
 //returns a nicely formatted string representing the StringLog
}
