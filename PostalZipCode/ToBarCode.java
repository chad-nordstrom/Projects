/*
 * Project: Postal Zip Code
 * This: tobarcode.java
 * Date: 11/13/14
 * Author: Chad Nordstrom
 * Purpose: To do get a zipcode and print the barcode associated with it and vice versa.
 */

package postalzipcode;

/**
 *
 * @author Chad
 */
import java.util.Scanner;

public class ToBarCode 
{
    
public int tenThousanths;
public int oneThousanths;
public int Hundreths;
public int Tenths;
public int Ones;
public int checkDigit;
public int zipNum;
public String temp;
public int Zip;
public static final String[] barcodes = new String[]{"||:::", ":::||", "::|:|",
    "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};


 
public ToBarCode()
{
Zip = 0;
}

 public int getZIP()
{
System.out.println("Enter a ZIP code : ");
Scanner input = new Scanner(System.in);
Zip = input.nextInt();
return Zip;
}
 
 public void getDigits(int zipNum)
{
tenThousanths = zipNum/10000;
oneThousanths = ((zipNum/1000)-tenThousanths*10);
Hundreths = (zipNum/100 - (tenThousanths*100 + oneThousanths*10));
Tenths = (zipNum/10 -(tenThousanths*1000 + oneThousanths*100 + Hundreths*10));
Ones = (zipNum - (tenThousanths*10000 + oneThousanths*1000 + Hundreths*100 + Tenths*10));
 
checkDigit = 100- (tenThousanths+oneThousanths+Hundreths+Tenths+Ones);
 
while(checkDigit>10)
{ checkDigit -= 10; }
System.out.print("|");
getBar(tenThousanths);
getBar(oneThousanths);
getBar(Hundreths);
getBar(Tenths);
getBar(Ones);
getBar(checkDigit);
System.out.print("|");
 
}
 
 public void getBar(int x)
{
 System.out.print(barcodes[x]);
}
 

 
}
