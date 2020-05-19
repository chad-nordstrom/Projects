/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringlog;

/**
 *
 * @author CN276
 */
public class ArrayStringLog implements StringLogInterface
{
  protected String name; //name of StringLog
  protected String[] log; //array to hold Strings
  protected int lastIndex = -1; //index of last string in array
  
  public ArrayStringLog(String name, int maxSize)
  {
      //precondition: maxSize > 0
      log = new String[maxSize];
      this.name = name;
  }
  
  public ArrayStringLog(String name)
  {
      //precondition: maxSize > 0
      log = new String[5];
      this.name = name;
  }
  
  public void insert(String element)
  {
      lastIndex++;
      log[lastIndex] = element;
  }
  
  public boolean isFull()
  {
      if (lastIndex == (log.length - 1))
      {    return true;
      }
      else 
      {
          return false;
      }
      
  }
  
  public int size()
  {
      return (lastIndex + 1);
  }
  
  public boolean contains(String element)
  {
      int location = 0;
      while (location <= lastIndex)
      {
          if (element.equalsIgnoreCase(log[location]))
          {
              return true;
          }
          else
          {
              location++;
          }
          
      }
      return false;
  }
  
  public void clear()
  {
      for (int index = 0; index <= lastIndex; index++)
      {
          log[index] = null;
      }
      lastIndex = -1;
  }
  
  public String getName()
  {
      return name;
  }
  
  public String toString()
  {
      String logString = "Log: " + name + "\n\n";
      for (int index = 0; index <= lastIndex; index++)
      {
          logString = logString + (index + 1 ) + ". "
                  + log[index] + "\n";
      }
      return logString;
  }
  
}
