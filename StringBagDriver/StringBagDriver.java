/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringbagdriver;
import java.util.Scanner;

/**
 *
 * 
 */
public class StringBagDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        System.out.println("Please give a name for your string bag: ");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.next();
        StringBagLinkedList list = new StringBagLinkedList(name);
        
        String choice = "";
        String info = "";
        
        boolean stopRemove = false;
        boolean stopAdd = false;
        
        while(!choice.equalsIgnoreCase("X")){
            
        System.out.println("Please type I to insert String into " + name + " Or type R to remove \n"
                + " a string or type V to view the contents of " + name + " or type X to exit");
        choice = keyboard.next();
        
        switch (choice) {
            case "I" :
                
                        System.out.println("Please enter a string");
                        while (stopAdd != true)
                        {
                        info = keyboard.next();
                        list.insert(info);
                        
                        System.out.println("Add another? y/n");
                        String noMore = keyboard.next();
                        
                        if (noMore.equalsIgnoreCase("n"))
                        {
                            stopAdd = true;
                        }
                        
                        } 
                        break;
            case "R":
                        while (stopRemove != true)
                        {
                        list.remove();
                       
                        System.out.println(list);
                        
                        System.out.println("Remove another? y/n");
                        String stop = keyboard.next();
                        
                        if (stop.equalsIgnoreCase("n"))
                        {
                            stopRemove = true;
                        }
                        
                        
                        }
                        break;       
            case "V":
                        System.out.println(list);
                
                        break;
            case "X":
                break;
                        }
        }
    
    }
        
    }
    
