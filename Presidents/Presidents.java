/*
 * Program: Presidents
 * This: presidents.java
 * Author: Chad Nordstrom
 * Date: 2/19/15
 * Purpose: To make a game of entering presidents names in the correct order and display the wrong answers.
 */
package presidents;

import java.util.Scanner;

/**
 *
 * @author CN276
 */
public class Presidents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner myInput = new Scanner(System.in);
        LLStack<String> myStack = new LLStack<String>();
        LLStack<String> myWrong = new LLStack<String>();
        
        
        
//                myStack.push("George Washington");     // 1
//                myStack.push("John Adams");            // 2
//                myStack.push("Thomas Jefferson");      // 3
//                myStack.push("James Madison");         // 4
//                myStack.push("James Monroe");          // 5
//                myStack.push("John Quincy Adams");     // 6
//                myStack.push("Andrew Jackson");        // 7
//                myStack.push("Martin Van Buren");      // 8
//                myStack.push("William Henry Harrison");// 9
//                myStack.push("John Tyler");            // 10
//                myStack.push("James K. Polk");         // 11
//                myStack.push("Zachary Taylor");        // 12
//                myStack.push("Millard Fillmore");      // 13
//                myStack.push("Franklin Pierce");       // 14
//                myStack.push("James Buchanan");        // 15
//                myStack.push("Abraham Lincoln");       // 16
//                myStack.push("Andrew Johnson");        // 17
//                myStack.push("Ulysses S. Grant");      // 18
//                myStack.push("Rutherford B. Hayes");   // 19
//                myStack.push("James A. Garfield");     // 20
//                myStack.push("Chester A. Arthur");     // 21
//                myStack.push("Grover Cleveland");      // 22
//                myStack.push("Benjamin Harrison");     // 23
//                myStack.push("Grover Cleveland");      // 24
//                myStack.push("William McKinley");      // 25
//                myStack.push("Theodore Roosevelt");    // 26
//                myStack.push("William Howard Taft");   // 27
//                myStack.push("Woodrow Wilson");        // 28
//                myStack.push("Warren G. Harding");     // 29
//                myStack.push("Calvin Collidge");       // 30
//                myStack.push("Herbert Hoover");        // 31
//                myStack.push("Franklin D. Roosevelt"); // 32
//                myStack.push("Harry S. Truman");       // 33
//                myStack.push("Dwight D. Eisenhower");  // 34
//                myStack.push("John F. Kennedy");       // 35
//                myStack.push("Lyndon B. Johnson");     // 36
//                myStack.push("Richard Nixon");         // 37
//                myStack.push("Gerald Ford");           // 38
//                myStack.push("Jimmy Carter");          // 39
                myStack.push("Ronald Reagan");         // 40
                myStack.push("George H. W. Bush");     // 41
                myStack.push("Bill Clinton");          // 42
                myStack.push("George W. Bush");        // 43
                myStack.push("Barack Obama");          // 44
            
    
         
        
        
        int count = 44;
        while (!myStack.isEmpty())
        {
            System.out.print("Enter the name of President #" + count + ": ");
            String name = myInput.nextLine();
            
            
            if (name.equalsIgnoreCase(myStack.top()))
            {
                
                System.out.println("President #" + count + " " + myStack.top() + " is correct!");

                myStack.pop();
                count--;
            }
            else
            {
            System.out.println(name + " is not correct!");
            myWrong.push(myStack.top());
            myStack.pop();
            
            count--;
            }
            
        }

        do
        {
        System.out.println("Wrong Answers: " + myWrong.top());
        
            myWrong.pop();
        } while(!myWrong.isEmpty());
    }
}

