/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleclass;


import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JComponent;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
/**
 *
 * @author Chad
 */
public class RectangleClass extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new RectangleClass();
        
    }
    
    public RectangleClass()
    {
        this.setSize(700,600);
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Rectangle Maker");
        this.setVisible(true);
        
        JPanel rectMaker = new JPanel();
        
        JButton button = new JButton("Save");
        JButton button2 = new JButton("Clear");
        
//        ListenButton ButtonListen = new ListenButton();
        
        JCheckBox interBox = new JCheckBox("Draw Intersections", false);
//        interBox.setMnemonic(KeyEvent.VK_I);
//        interBox.setSelected(false);
        
        JCheckBox unionBox = new JCheckBox("Draw Union", false);
//        unionBox.setMnemonic(KeyEvent.VK_U);
//        unionBox.setSelected(false);
        
        JCheckBox commonBox = new JCheckBox("Draw Common Area", false);
//        commonBox.setMnemonic(KeyEvent.VK_C);
//        commonBox.setSelected(false);
        
    //   interBox.addItemListener(this);
    
//        rectMaker.setBounds(30, 30, 300, 300);
        
//        container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
        
      //  container.add(rectMaker);
        
        rectMaker.add(interBox);
        rectMaker.add(unionBox);
        rectMaker.add(commonBox);
        rectMaker.add(button2);
        rectMaker.add(button, "South");
        
        this.add(rectMaker);
    }
    
    
    public void paintComponent(Graphics g)
    {
        g.drawRect(10, 10, 200, 200);
        
    }
    
    
//    public void itemStateChanged(ItemEvent e){
//        
//    }
//    private class ListenButton implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//        
//    }
    

            

}
