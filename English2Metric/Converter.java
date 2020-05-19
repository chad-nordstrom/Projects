/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package english2metric;

/**
 *
 * @author CN276
 */
public class Converter 
{
    final double INCH = 1d;
    final double FOOT = 12d;
    final double YARD = 36d;
    final double MILE = FOOT * 5280d;
    final double MM2INCH = 25.4d;
    final double CM2INCH = 2.54d;
    final double M2INCH = .254d;
    final double KM2INCH = 25.4 / 1000000;
    private double numOfInches = 0d;
    
    final double MM = 1d;
    final double CM = 10d;
    final double M = 1000d;
    final double KM = 1000000d;
    final double INCH2MM = 1/25.4;
    final double FT2MM = INCH2MM / FOOT;
    final double YD2MM = INCH2MM / YARD;
    final double MI2MM = INCH2MM / MILE;
    private double numOfMM = 0d;
    
    private String fromConvert = "";
    private String toConvert = "";
    private double unitsToConvert = 0d;
    
    public Converter()
            {   
            }
    
    public Converter(String from, String to, double amount)
    {
        this.fromConvert = from;
        this.toConvert = to;
        this.unitsToConvert = amount;
    }
    
    public void getFrom(String from)
    {
        
        fromConvert = from;
        if(fromConvert.equalsIgnoreCase("IN")
            || fromConvert.equalsIgnoreCase("FT")
            || fromConvert.equalsIgnoreCase("YD")
            || fromConvert.equalsIgnoreCase("MI"))
        {
            
            
            convertFromEnglish();
        }
        else
        {
            
            convertFromMetric();
        }
        
      
    }
    
  public void convertFromEnglish()
    {
        if(fromConvert.equalsIgnoreCase("IN"))
        {
            numOfInches = INCH;
        }
        else if(fromConvert.equalsIgnoreCase("FT"))
        {
            numOfInches = FOOT;
        }
        else if(fromConvert.equalsIgnoreCase("YD"))
        {
            numOfInches = YARD;
        }
        else 
        {
            numOfInches = MILE;
        }
        numOfInches = numOfInches * unitsToConvert;
        
        //System.out.printf("There are %.2f inches in a %s",
        //        numOfInches, fromConvert);

    }

    public void convertFromMetric()
    {
        if(fromConvert.equalsIgnoreCase("MM"))
        {
            numOfMM = MM;
        }
        else if(fromConvert.equalsIgnoreCase("CM"))
        {
            numOfMM = CM;
        }
        else if(fromConvert.equalsIgnoreCase("M"))
        {
            numOfMM = M;
        }
        else 
        {
            numOfMM = KM;
        }
        numOfMM = numOfMM * unitsToConvert;
        
    //    System.out.printf("There are %.2f MM in a %s",
    //           numOfMM, fromConvert);
}
    
    public void getTo(String to)
    {
        toConvert = to;
        
        String toConversionType = "";
        String fromConversionType = "";
        
        if(fromConvert.equalsIgnoreCase("IN")
            || fromConvert.equalsIgnoreCase("FT")
            || fromConvert.equalsIgnoreCase("YD")
            || fromConvert.equalsIgnoreCase("MI"))
        {
           fromConversionType = "English"; 

        }
        else
        {
           fromConversionType = "Metric";
        }
        
        if(toConvert.equalsIgnoreCase("IN")
            || toConvert.equalsIgnoreCase("FT")
            || toConvert.equalsIgnoreCase("YD")
            || toConvert.equalsIgnoreCase("MI"))
        {
           toConversionType = "English"; 

        }
        else
        {
           toConversionType = "Metric";
        }
        
        
        if (fromConversionType.equals("English") && toConversionType.equals("English"))
        {
            convertEngToEng();
        }
        else if (fromConversionType.equals("English") && toConversionType.equals("Metric"))
        {
            convertEngToMet();
        }
        else if (fromConversionType.equals("Metric") && toConversionType.equals("Metric"))
        {
            convertMetToMet();
        }
        else if (fromConversionType.equals("Metric") && toConversionType.equals("English"))
        {
            convertMetToEng();
        }
    }
    
    public void convertEngToEng()
    {
    
                
            if(toConvert.equalsIgnoreCase("IN"))
                    {
                        double converted = numOfInches;
                        System.out.printf("%.2f %s is %.2f %s", unitsToConvert, fromConvert, converted, toConvert);
                    }
            else if (toConvert.equalsIgnoreCase("FT"))
            {
                        double converted = numOfInches / FOOT;
                        System.out.printf("%.2f %s is %.2f %s", numOfInches, fromConvert, converted, toConvert); 
            }
            else if (toConvert.equalsIgnoreCase("YD"))
            {
                        double converted = numOfInches / YARD;
                        System.out.printf("%.2f %s is %.2f %s", numOfInches, fromConvert, converted, toConvert); 
            }
            else if (toConvert.equalsIgnoreCase("MI"))
            {
                        double converted = numOfInches / MILE;
                        System.out.printf("%.2f %s is %.2f %s", numOfInches, fromConvert, converted, toConvert); 
            }
            
    }
    public void convertMetToMet()
    {
        if(toConvert.equalsIgnoreCase("MM"))
                    {
                        double converted = numOfMM;
                        System.out.printf("%.2f %s is %.2f %s", unitsToConvert, fromConvert, converted, toConvert);
                    }
        else if (toConvert.equalsIgnoreCase("CM"))
            {
                        double converted = numOfMM / CM;
                        System.out.printf("%.2f %s is %.2f %s", numOfMM, fromConvert, converted, toConvert); 
            }
        else if (toConvert.equalsIgnoreCase("M"))
            {
                        double converted = numOfMM / M;
                        System.out.printf("%.2f %s is %.2f %s", numOfMM, fromConvert, converted, toConvert); 
            }
        else if (toConvert.equalsIgnoreCase("KM"))
            {
                        double converted = numOfMM / KM;
                        System.out.printf("%.2f %s is %.2f %s", numOfMM, fromConvert, converted, toConvert); 
            }
    }
    
    public void convertEngToMet()
    {
        double numOfConv = 0d;
        
        if(toConvert.equalsIgnoreCase("MM"))
        {
            numOfConv = MM2INCH;
        }
        else if(toConvert.equalsIgnoreCase("CM"))
        {
            numOfConv = CM2INCH;
        }
        else if(toConvert.equalsIgnoreCase("M"))
        {
            numOfConv = M2INCH;
        }
        else 
        {
            numOfConv = KM2INCH;
        }
        numOfConv = numOfConv * unitsToConvert;
        
        if(toConvert.equalsIgnoreCase("MM"))
                    {
                        double converted = numOfConv;
                        System.out.printf("%.2f %s is %.2f %s", unitsToConvert, fromConvert, converted, toConvert);
                    }
        else if (toConvert.equalsIgnoreCase("CM"))
            {
                        double converted = numOfConv / CM;
                        System.out.printf("%.2f %s is %.2f %s", numOfConv, fromConvert, converted, toConvert); 
            }
        else if (toConvert.equalsIgnoreCase("M"))
            {
                        double converted = numOfConv / M;
                        System.out.printf("%.2f %s is %.2f %s", numOfConv, fromConvert, converted, toConvert); 
            }
        else if (toConvert.equalsIgnoreCase("KM"))
            {
                        double converted = numOfConv / KM;
                        System.out.printf("%.2f %s is %.2f %s", numOfConv, fromConvert, converted, toConvert); 
            }
    }
    
    public void convertMetToEng()
    {
        double numOfConv = 0d;
        
        if(toConvert.equalsIgnoreCase("IN"))
        {
            numOfConv = INCH2MM;
        }
        else if(toConvert.equalsIgnoreCase("FT"))
        {
            numOfConv = FT2MM;
        }
        else if(toConvert.equalsIgnoreCase("YD"))
        {
            numOfConv = YD2MM;
        }
        else 
        {
            numOfConv = MI2MM;
        }
        numOfConv = numOfConv * unitsToConvert;
        
        if(toConvert.equalsIgnoreCase("IN"))
                    {
                        double converted = numOfConv;
                        System.out.printf("%.2f %s is %.2f %s", unitsToConvert, fromConvert, converted, toConvert);
                    }
        else if (toConvert.equalsIgnoreCase("FT"))
            {
                        double converted = numOfConv / FOOT;
                        System.out.printf("%.2f %s is %.2f %s", numOfConv, fromConvert, converted, toConvert); 
            }
        else if (toConvert.equalsIgnoreCase("YD"))
            {
                        double converted = numOfConv / YARD;
                        System.out.printf("%.2f %s is %.2f %s", numOfConv, fromConvert, converted, toConvert); 
            }
        else if (toConvert.equalsIgnoreCase("MI"))
            {
                        double converted = numOfConv / MILE;
                        System.out.printf("%.2f %s is %.2f %s", numOfConv, fromConvert, converted, toConvert); 
            }
    }
    public void getUnits(double amount)
    {
        System.out.println("You got getUnits!");
        unitsToConvert = amount;
    }
    
    
}
