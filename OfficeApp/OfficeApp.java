/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeapp;
import java.util.Scanner;
/**
 *
 * @author CN276
 */
public class OfficeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Printer myPrint = new Printer();
        Scanner myIn = new Scanner(System.in);
        int choice = 0;
        
        
        System.out.println("Welcome to the office printer. ");
        myPrint.fillPaper();
        System.out.println("Please, enter your choice of what you'd like to do.");
            try
        {
        do 
        {
        
        System.out.println( "Enter 1 to allow an employee the use of the printer."
                + "\nEnter 2 to fill the printer. \nEnter 3 to exit.");      
        
        choice = myIn.nextInt();
        
        switch(choice)
        {
            case 1:
            {
                myPrint.employeeQueue();
                myPrint.employeeUse();
                break;
            }
            
            case 2:
            {
               
                myPrint.fillPaper();
                break;
            }
                
        }
        
        } while (choice != 3);
        } catch(Exception e){
            System.out.println("I can't let you do that, Doug. Enter only 1-3."); 
            
        }
    }
}
