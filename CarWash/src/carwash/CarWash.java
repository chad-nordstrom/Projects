/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carwash;

import java.util.Random;

/**
 *
 * @author CN276
 */


public class CarWash
{
    LinkedUnbndQueue myWash = new LinkedUnbndQueue();
    protected final int MIN_IAT = 1; //min inter-arrival time
    protected final int MAX_IAT = 5; //max inter-arrival time
    protected final int SERVICE = 5; // Service Time
    protected final int MAX_TIME = 30; // to change the time 30/60
    Random rand = new Random();
    protected int currTime = 0;
    protected String car = "car";
    protected int numCars = 0; // Keeps track of the number of cars in the queue
    protected int numCarsSer = 0; // Keeps track of the number of cars serviced
    protected int lastArrival = 0; // Keeps track of the last arrival
    protected int lastWash = -5; // Keeps track of the last wash
    protected int IAT = 0;
    
    public CarWash()
    {
        
    }
    
    public void carGenerator()
    {
        
        
        
        /* **********************************************************
        // First Car
        System.out.println("CurrTime is " + currTime);
        
        myWash.enqueue(car);
        numCars++;
        System.out.println("Num of Cars in Queue = " + numCars);
        
        myWash.dequeue();
        numCars--;
        numCarsSer++;
        
        System.out.println("Num of Cars Serviced = " + numCarsSer);
        // **********************************************************
        
        //while (currTime < MAX_TIME) // Add new Cars to the Queue*/
        for (currTime = 0; currTime < MAX_TIME; currTime++)
        {
            if (currTime == lastArrival + IAT || currTime >= lastWash + SERVICE)
            {
                System.out.println("\nCurrTime is " + currTime);
                if (currTime == lastArrival + IAT) // Add new Cars to the Queue
                {
                    IAT = MIN_IAT + rand.nextInt(MAX_IAT - MIN_IAT + 1);
                    lastArrival = currTime;
                    myWash.enqueue(car);
                    System.out.println("New Car Arrived.");
                    numCars++;
                }
                if (currTime >= lastWash + SERVICE) // Service the Cars, every 5 minutes a car will enter wash
                {
                    myWash.dequeue();
                    lastWash = currTime;
                    System.out.println("Car entered the wash.");
                    System.out.println("_____________________");
                    numCars--;
                    numCarsSer++;
                }
                System.out.println("Num of Cars in Queue = " + numCars);
                System.out.println("Num of Cars serviced = " + numCarsSer);
            }
        }
        
        
    }
    
}
