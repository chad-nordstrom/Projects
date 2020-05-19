/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedstringlog;

/**
 *
 * @author CN276
 */
public interface StringLogInterface {
    boolean isFull();
    
    int size();
    
    boolean contains(String element);
    
    void clear();
    
    @Override
    String toString();
}
