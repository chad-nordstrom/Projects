/*
 * Project: Postal Zip Code
 * This: frombarcode.java
 * Date: 11/13/14
 * Author: Chad Nordstrom
 * Purpose: To do get a zipcode and print the barcode associated with it and vice versa.
 */
package postalzipcode;

import java.util.Scanner;

/**
 *
 * @author CN276
 */
public class FromBarCode 
{
    public int numb;
    public String subs;
    
public FromBarCode()
{

}
    
public String enterBar()
{
System.out.println("Enter a barcode with using : or | ");
Scanner myIn = new Scanner(System.in);
String bar = myIn.nextLine();
return bar;
}
 
 public void getNumber(String temp)
{
for (int count = 0; count < ToBarCode.barcodes.length; count++)
{
    if (temp.equals(ToBarCode.barcodes[count]))
        numb = count;
}
System.out.print(numb);
}

 
 public void divide(String temp)
{
FromBarCode getNums = new FromBarCode();
subs = temp.substring(1,6);
getNums.getNumber(subs);
subs = temp.substring(6,11);
getNums.getNumber(subs);
subs = temp.substring(11,16);
getNums.getNumber(subs);
subs = temp.substring(16,21);
getNums.getNumber(subs);
subs = temp.substring(21,26);
getNums.getNumber(subs);
 
}
}
