/**
*Program: Geometry1
*This: Circle.java
*Date: 2-3-2015
*Author: D. Lontai
*Purpose: To define the constructor and methods for the 
*         Circle class. 
*/

package geometry1;
import java.lang.Math;
/**
 *
 * @author Carol
 */
public class Circle implements GeometryInterface {
    
    private float radius;
    private float degrees;
    
    
    public Circle(float radius){
        this.radius = radius;
    }
    public float sector(float degrees) throws Exception{
        if(degrees>360.0 || degrees<0 ){
            throw new Exception("Degrees must be between 0.0 and 360.0");
        }
        return this.area() * (degrees / 360);
    }
    public float area(){
        return (float)Math.PI * radius * radius;
    }
    
    public float perimeter(){
        return 2 * (float)Math.PI * radius;
    }
}
