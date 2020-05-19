/**
*Program: Geometry1
*This: Rectangle.java
*Date: 2-3-2015
*Author: D. Lontai
*Purpose: To define the constructor and methods for the 
*         Rectangle class. 
*/

package geometry1;

/**
 *
 * @author Carol
 */
public class Rectangle implements GeometryInterface {
    private float length;
    private float width;
    
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
    
     public float area(){
        return length * width;
    }
    
    public float perimeter(){
        return 2 * (length + width);
    }
    
}
