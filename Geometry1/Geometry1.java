/**
*Program: Geometry1
*This: Geometry1.java
*Date: 2-3-2015
*Author: D. Lontai
*Purpose: To allow for user input of shape dimensions and 
*         calculates area, sector, circumference, and
*         perimeter of the shapes. 
*/

package geometry1;
import java.util.Scanner;
/**
 *
 * @author Carol
 */
public class Geometry1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        //myCircle.sector(380);
        System.out.print("Please enter in the radius of a circle: ");
        float radius = keyboard.nextFloat();
        Circle myCircle = new Circle(radius);
        
        System.out.print("Please enter in the degrees of a sector of a circle: ");
        float degrees = keyboard.nextFloat();
        float areaOfSector = myCircle.sector(degrees);
        
        
        System.out.print("Please enter in the length of a rectangle: ");
        float length = keyboard.nextFloat();
        System.out.print("Please enter in the width of a rectangle: ");
        float width = keyboard.nextFloat();
        Rectangle myRectangle = new Rectangle(length, width);
        
        System.out.print("Please enter in the base of a right triangle: ");
        float base = keyboard.nextFloat();
        System.out.print("Please enter in the height of a right triangle: ");
        float height = keyboard.nextFloat();
        RightTriangle myRightTriangle = new RightTriangle(base, height);
        
        System.out.println("The area of the circle's sector is: " + myCircle.sector(degrees));
        System.out.println("The area of the circle is: " + myCircle.area());
        System.out.println("The circumference of the circle is: " + myCircle.perimeter());
        
        System.out.println("The area of the rectangle is: " + myRectangle.area());
        System.out.println("The perimeter of the rectangle is: " + myRectangle.perimeter());
        
        System.out.println("The area of the right triangle is: " + myRightTriangle.area());
        System.out.println("The perimeter of the right triangle is: " + myRightTriangle.perimeter());
        
        
    }
    
}
