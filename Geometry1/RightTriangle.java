/**
*Program: Geometry1
*This: RightTriangle.java
*Date: 2-3-2015
*Author: D. Lontai
*Purpose: To define the constructor and methods for the 
*         RightTriangle class. 
*/

package geometry1;

/**
 *
 * @author Carol
 */
public class RightTriangle implements GeometryInterface {
    
    private float base;
    private float height;
    
    public RightTriangle(float base, float height){
        this.base = base;
        this.height = height;
    }
    
     public float area(){
        return (base * height) / 2 ;
    }
    
    public float perimeter(){
        return (base + height) + (float)Math.sqrt((base * base) + (height * height));
    }
}
