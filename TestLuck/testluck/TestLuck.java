/**
*Program: TestLuck
*This: ArrayIntLog.java
*Date: 27-Jan-2015
*Author: D. Lontai
*Purpose: To show how many repeats until a number repeats with a 
*         random number generator 10 times and gives the average. 
*/
package testluck;
import java.util.Random;
/**
 *
 * @author dl153a
 */
public class TestLuck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total = 0;
        
        for (int i = 0; i < 10; i++){
            total += generateNumberUntilRepeat();
        }
        System.out.println("Average result");
        System.out.println(total / 10.0);
    }
    public static int generateNumberUntilRepeat(){
        Random random = new Random(System.nanoTime() * System.currentTimeMillis());
        int number = random.nextInt(10000)+1;
        ArrayIntLog sample = new ArrayIntLog("sample", 10001);
        
        while(! sample.contains(number)){
            sample.insert(number);
            number = random.nextInt(10000) +1;
        }
        System.out.println("Attempts until duplicate number");
        System.out.println(sample.size());
        return (sample.size());
    }
}
