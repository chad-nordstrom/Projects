/**
*Program: TestLuck
*This: IntLogInterface.java
*Date: 27-Jan-2015
*Author: D. Lontai
*Purpose: The interface for the ArrayIntLog. 
*/
package testluck;

/**
 *
 * @author dl153a
 */
public interface IntLogInterface {
    String getName();//returns the name of the StringLog
    
    void insert(int elements);//places element into log
    //preconditions: Log may not be full
    
    boolean isFull();
    //returns True is the Log is full; False if it is not
    
    int size();
    //returns the number of Strings stored in the Log
    
    void clear();
    //makes the log empty
    
    boolean contains(int elements);
    //returns true if the element is in the Log, False if it is not found
    //ignores case differences
    
    @Override
    String toString();
    //returns a nicely formatted String representing the StringLog
    
}
