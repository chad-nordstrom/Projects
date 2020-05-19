/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedstringlog;

/**
 *
 * @author CN276
 */
public class LinkedStringLog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LLStringLog test = new LLStringLog("Testing");
        LLStringNode node1 = new LLStringNode("Node1");
        LLStringNode node2 = new LLStringNode("Node2");
        test.insert("Doug");
        test.insert("Wally");
        System.out.println(test.size());
        
        System.out.println(test.toString());
        
        boolean foundDoug = test.contains("Doug");
        boolean foundMarvin = test.contains("Marvin");
        boolean foundWally = test.contains("WalLy");
        
        System.out.println("Found Doug: " + foundDoug);
        System.out.println("Found Marvin: " + foundMarvin);
        System.out.println("Found Wally: " + foundWally);
    }
}
