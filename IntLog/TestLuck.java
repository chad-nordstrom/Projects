/*
 * Program: IntLog
 * This: testluck.java
 * Author: Chad Nordstrom
 * Date: 5/4/15
 * Purpose: To generate random numbers until numbers are duplicated.
 */
package intlog;

import java.util.Random;

/**
 *
 * @author Chad
 */
public class TestLuck {
    
    public TestLuck()
    {
        numGen();
    }
    public int numGen(){
        Random rando = new Random();
        int number = rando.nextInt(10001);
        ArrayIntLog sample = new ArrayIntLog("sample", 10001);
        
        while(!sample.contains(number)){
            sample.insert(number);
            number = rando.nextInt(10001);
        }
        System.out.print("Attempts until number is duplicated: ");
        System.out.println(sample.size());
        return (sample.size());
    }
}
