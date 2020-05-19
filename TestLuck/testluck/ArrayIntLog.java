/**
*Program: TestLuck
*This: ArrayIntLog.java
*Date: 27-Jan-2015
*Author: D. Lontai
*Purpose: To define the constructor and methods for use in the TestLuck program. 
*/
package testluck;

/**
 *
 * @author dl153a
 */
public class ArrayIntLog implements IntLogInterface {

    protected String name; //name of IntLog
    protected int[] log; //array to hold the Strings
    protected int lastIndex = -1; //index of last String in array

    public ArrayIntLog(String name, int maxSize) {
        //preconditions: maxSize > 0
        log = new int[maxSize];
        this.name = name;
    }

    public ArrayIntLog(String name) {
        //preconditions: maxSize > 0
        log = new int[5];
        this.name = name;
    }

    public void insert(int element) {
        lastIndex++;
        log[lastIndex] = element;
    }

    public boolean isFull() {
        if (lastIndex == (log.length - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return (lastIndex + 1);
    }

    public boolean contains(int element) {
        int location = 0;
        while (location <= lastIndex) {
            if (element == (log[location])) {
                return true;
            } else {
                location++;
            }
        }
        return false;
    }

    public void clear() {
        for (int index = 0; index <= lastIndex; index++) {
            log[index] = 0;
        }
        lastIndex = -1;
    }

    public String getName() {
        return name;
    }
    public int getIndex(int number){
        int location = 0;
        while (location <= lastIndex) {
            if (number == (log[location])) {
                return location;
            } else {
                location++;
            }
        }
        return -1;
    }    

    public String toString() {
        String logString = "Log: " + name + "\n\n";
        for (int index = 0; index <= lastIndex; index++) {
            logString = logString + (index + 1) + ", "
                    + log[index] + "\n";
        }
        return logString;
    }
}
    

