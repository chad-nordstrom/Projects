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
public class StringBagNode {
    private String info;
    public StringBagNode link;
    public int userChoice = 0;
    
    public StringBagNode(String info){
        this.info = info;
        link = null;    
        
    }
    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return info;
    }
    public void setLink(StringBagNode link){
        this.link = link;
    }
    public StringBagNode getLink(){
        return link;
    }
    
}
    

