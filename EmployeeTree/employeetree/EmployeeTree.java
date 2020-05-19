/*
 * Project: EmployeeTree
 * This: employeetree.java
 * Author: Chad Nordstrom
 * Date: 4/7/15
 * Purpose: To use binary trees to sort out employees
 */
package employeetree;

/**
 *
 * @author CN276
 */
public class EmployeeTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BinaryTree theTree = new BinaryTree();
        
        theTree.addNode(50, "Boss");
        theTree.addNode(25, "Vice President");
        theTree.addNode(15, "Office Managers");
        theTree.addNode(30, "Secretary");
        theTree.addNode(75, "Sales Manager");
        theTree.addNode(85, "Salesman1");
        
        //different ways to traverse the tree
        theTree.inOrderTraverseTree(theTree.root);
//        theTree.preorderTraverseTree(theTree.root);
//        theTree.postOrderTraverseTree(theTree.root);
        System.out.println();
        System.out.println(theTree.findNode(75));
    }
}
