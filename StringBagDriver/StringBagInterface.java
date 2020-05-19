/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringbagdriver;
/**
 *
 * 
 */
public interface StringBagInterface {
    
    void insert(String s);
    
    String remove(int userChoice);
    
    void clear();
    
    boolean isEmpty();
    
    int size();
    
    @Override
    String toString();
    
    
    
    
}
