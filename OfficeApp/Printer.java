/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeapp;
//import java.util.Stack;
import java.util.Random;
/**
 *
 * @author CN276
 */
public class Printer {
    public final int max = 5;
    public final int min = 1;
    public int num = 0;
    private int numEmp = 0;
    private int startEmp = 1;
    private int totalEmp = 0;
    private int empInc = 0;
    LinkedUnbndQueue myEmp = new LinkedUnbndQueue();
    
    
    BoundedStackInterface<String> printPaper = new ArrayStack<>(50);

    public Printer()
    {

        
    }
    
    public void fillPaper()
    {
        
        String blanks = "";
      if (printPaper.isFull())
      {
          System.out.println("Printer is full! Cannot fill.");
      }
      else
      {
        while (!printPaper.isFull())
        {
          printPaper.push(blanks);
          num++;
        }
            System.out.println("Your printer is now full.");
      }
    }
    
    public void employeeQueue()
    {
    Random rand = new Random();
//    String empName = "";
//    int maxEmp = 40;
    
    int chosey = rand.nextInt((max - min) + 1) + min;
    int choz = rand.nextInt((max - min) + 1) + min;
    if (startEmp == 1)
    {
        for (int count = 1; count <= chosey; count++)
        { 
            myEmp.enqueue("Bob");
            numEmp++;
            
        }
        System.out.println("Employees currently at the printer: " + numEmp);
        startEmp--;
    }  
    else
    {
        if (chosey < 3)
        { 
   for (int cont = 1; cont <= choz; cont++)
        {
           
            
            myEmp.enqueue("Bob");
            numEmp++;
//            empInc++;
        }
        
   
        }
//          System.out.println("More arrived at the printer.");
        System.out.println("Employees currently at the printer: " + (numEmp));

    }
    
    }
    
    public void employeeUse()
    {
        Random rando = new Random();
       
        int choser = rando.nextInt((max - min) + 1) + min;
        
        
        if (!myEmp.isEmpty())
        {
            if (printPaper.isEmpty() || choser > num)
            {
            System.out.println("Cannot use printer, printer is empty or "
                    + "there are not enough pages in the printer to fulfill the request.");
            }
            else
            {
            System.out.println("Employee used " + choser + " papers from the printer.");
                for (int count = 1; count <= choser; count++)
                {
                printPaper.pop();
                num--;
                }
                
        myEmp.dequeue();
        numEmp--;
        

        System.out.println("\nEmployee left the printer. There are now " + numEmp
                + " employees in line at the printer.");
            }
        }
        
        else
        {
            System.out.println("\nThere are no employees needing to use the printer!\n");
        }
        System.out.println("\nPrinter has " + num + " blank papers.\n");

    }
}
