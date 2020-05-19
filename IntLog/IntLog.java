/*
 * Program: IntLog
 * This: intlog.java
 * Author: Chad Nordstrom
 * Date: 5/4/15
 * Purpose: To generate random numbers until numbers are duplicated.
 */
package intlog;

/**
 *
 * @author CN276
 */
import java.util.Random;
public class IntLog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     TestLuck myTest = new TestLuck();
     
        int total = 0;
        double average = 0;
        for (int i = 0; i < 10; i++){
            total += myTest.numGen();
        }
        
        average = total / 10.0;
        System.out.print("The average is " + average);
         
//     ArrayIntLog sample = new ArrayIntLog("Strange", 10001);
//     Random randNum = new Random();
//     int attempts = 0;
//     int rando = randNum.nextInt(10001);
//     
//     for (int count = 0; count < 10; count++)
//     {
//          
//     while(!sample.contains(rando)){
//            sample.insert(rando);
//            rando = randNum.nextInt(10000) +1;
//            attempts++;
//        }
//     
//    System.out.println(attempts);
            
//       }
     
     
     
     
     
     
    }
}
