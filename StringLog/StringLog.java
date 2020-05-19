/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringlog;

/**
 *
 * @author CN276
 */
public class StringLog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     ArrayStringLog sample = new ArrayStringLog("Sample", 4);
     
     sample.insert("Elvis");
     sample.insert("King Henry VIII");
     sample.insert("Captain Kirk");
     sample.insert("Prof. Peterson");
     
     System.out.println(sample);
     
     
     System.out.println("Elvis is in the log: " + sample.contains("eLvIs"));
     System.out.println("Santa is in the log: " + sample.contains("SANTA"));
     System.out.println("The mad professor is in the log: " + sample.contains("Prof. Peterson"));
     
     System.out.println("This array is full: " + sample.isFull());
     sample.clear();
     System.out.println("The size of the log is " + sample.size());
    }
}
