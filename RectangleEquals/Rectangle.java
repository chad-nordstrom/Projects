/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleequals;
import java.util.Scanner;
/**
 *
 * @author Chad
 */
public class Rectangle {
    public int length;
    public int width;
    
    
    public Rectangle rec1;
    public Rectangle rec2;
    
    public Rectangle()
    {
        recWork();
        equals();
//        System.out.println(equals());
    }
    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
        
    }
    
    public void recWork()
    {
        Scanner myIn = new Scanner(System.in);
        
        System.out.println("Enter the length of the first rectangle");
        int cLength = myIn.nextInt();
        System.out.println("Enter the width of the first rectangle");
        int cWidth = myIn.nextInt();
        
        this.rec1 = new Rectangle(cLength, cWidth);
        
        System.out.println("Enter the length of the second rectangle");
        cLength = myIn.nextInt();
        System.out.println("Enter the width of the second rectangle");
        cWidth = myIn.nextInt();
        
        this.rec2 = new Rectangle(cLength, cWidth);
        
    }
    public boolean equals()
    {
        

        if (rec1.length == rec2.length && rec1.width == rec2.width)
        {
            System.out.println("Rectangles are the same width and length.");
            return true;
        }
        else if (rec1.length == rec2.width && rec1.width == rec2.length)
        {
            System.out.println("Rectangles are Congruent.");
            return true;
        }
//        else if (rec1.length % rec1.width == 0 )
//        {
//            System.out.println("Rectangles have the same ratio.");
//            return true;
//        }
        else if ((2 * (rec1.length + rec1.width)) == (2 *(rec2.length + rec2.width)))
        {
            System.out.println("Rectangles have the same perimeter.");
            return true;
        }
        else if (rec1.length * rec1.width == rec2.length * rec2.length)
        {
            System.out.println("Rectangles have the same perimeter.");
            return true;
        }
        else
        {
            System.out.println("Rectangles are not equal.");
            return false;
        }
    }
}
