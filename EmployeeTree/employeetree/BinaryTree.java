/*
 * Project: EmployeeTree
 * This: binarytree.java
 * Author: Chad Nordstrom
 * Date: 4/7/15
 * Purpose: To use binary trees to sort out employees
 */
package employeetree;

/**
 *
 * @author CN276
 */
public class BinaryTree 
{
    Node root;
    
    public BinaryTree()
    {
        // default constructor
    }
    
    // create a new node and initialize it
    public void addNode(int key, String name)
    {
        Node newNode = new Node(key, name);
        
        // if there is no node then this will be the root
        if(root == null)
        {
            root = newNode;
        }
        else
        {
            // set root as the Node we will start
            // with as we traverse the tree
            Node focusNode = root;
            
            // future parent for our new node
            
            Node parent;
            
            while(true)
            {
                // root is the top parent so we start there
                parent = focusNode;
                
                //check if the new node should go on
                // the left side of the parent node
                if (key < focusNode.key)
                {
                    // switch focus to left child
                    focusNode = focusNode.leftChild;
                    
                    // if left child has no child
                    if(focusNode == null)
                    {
                        // then pleace new node on the left
                        parent.leftChild = newNode;
                        return; // All Done
                    }
                }
                else // if we get here put the node on the right
                {
                    focusNode = focusNode.rightChild;
                    // if the right child has no child
                    if(focusNode == null)
                    {
                        // then place the new node on the right side
                        parent.rightChild = newNode;
                        return; // All Done
                    }
                }
            }
        }
    }
    // All nodes are visited in ascending order
    // recursion is used to go to one node and
    // then go to its child nodes and so forth
    
    
    public void inOrderTraverseTree(Node focusNode)
    {
        if (focusNode != null)
        {
            // traverse te left node
            inOrderTraverseTree(focusNode.leftChild);
            
            // visit the currently focused on node
            System.out.println(focusNode);
            
            // traverse the right node
            inOrderTraverseTree(focusNode.rightChild);
        }
    }
    
        public void preorderTraverseTree(Node focusNode)
        {
            if(focusNode != null)
            {
                System.out.println(focusNode);
                preorderTraverseTree(focusNode.leftChild);
                preorderTraverseTree(focusNode.rightChild);
            }
        }
        
       public void postOrderTraverseTree(Node focusNode)
       {
           if(focusNode != null)
           {
               postOrderTraverseTree(focusNode.leftChild);
               postOrderTraverseTree(focusNode.rightChild);
               
               System.out.println(focusNode);
           }
       }
       
       public Node findNode(int key)
       {
           // start at the top of the tree
           Node focusNode = root;
           
           // while we have not found the Node
           // keep looking
           while(focusNode.key != key)
           {
               // of we should search to the left
               if(key < focusNode.key)
               {
                   // shift the focus Node to the left child
                   focusNode = focusNode.leftChild;
               }
               else
               {
                   // shoft the focus node to the right child
                   focusNode = focusNode.rightChild;
               }
               
               if(focusNode == null)
               {
                   return null;
               }
           }
           return focusNode;
       }
}
