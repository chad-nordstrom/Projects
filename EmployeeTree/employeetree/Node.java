/*
 * Project: EmployeeTree
 * This: node.java
 * Author: Chad Nordstrom
 * Date: 4/7/15
 * Purpose: To use binary trees to sort out employees
 */
package employeetree;

/**
 *
 * @author CN276
 */
public class Node 
{
    int key;
    String name;
    
    Node leftChild;
    Node rightChild;
    
    public Node(int key, String name)
    {
        this.key = key;
        this.name = name;
    }
    
    public String toString()
    {
        return name + " has the key " + key;
    }
}
