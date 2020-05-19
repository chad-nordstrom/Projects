/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmclock;

/**
 *
 * @author marlf
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class AlarmMaker {
    
    int alarmHour = 0;
    int alarmMin = 0;
    boolean snooze = false;
    int snoozeNum = 0;
    Scanner myIn = new Scanner(System.in);
    
    public AlarmMaker()
    {
        
    }
    
    // Actually probably not a necessary method, may remove
    public void setAlarm(int hour, int min)
    {
     alarmHour = hour;
     alarmMin = min;
    }
    
    // set an alarm for a certain date and time, may edit for easier input
    public void dateAlarm() throws Exception
    {
        
        Date date = new Date();
        String userDate = "";
        
        // Get user input to set alarm
        System.out.println(date);
        System.out.println("Please enter the date and time you would"
                + " like to set the alarm for in the format dd-MM-YYYY hh:mm (AM/PM).");
        userDate = myIn.nextLine();

        // Definies the format necessary for user input to Date class
        SimpleDateFormat alarmDate = new SimpleDateFormat("dd-MM-yyyy hh:mm a");
        String alarm = userDate;
        
        // May use this later
//        String alarm = day + "-" + month + "-" + "2016" + " " + hour + ":" 
//                + min + ":" + "00";

        
        try
        {
            // Simply parses and prints out the alarm date, may remove later
            Date newDate = alarmDate.parse(alarm);
            System.out.println(newDate);
            
            // Checks if the alarm date/time is before the current time
            // then restarts the method if true
            if (newDate.before(date)) 
            {
            System.out.println("YOU CREATED A TIME PARADOX!");
            dateAlarm();
            } 
            else
            {
                // Checks current time until alarm time is reached
                while (date.before(newDate))
                {
                    date = new Date();
                }
                // Plays Alarm Noise
                alarmNoise();
            }
        } catch (ParseException e)
        {
            e.printStackTrace();
        }
        
        
  
        }
    
    // Makes a alarm to be set off in X minutes
    public void minAlarm() throws Exception
    {
        System.out.println("Please Enter how many minutes from now"
                + " you would like the alarm to sound.");
        int go = myIn.nextInt();
        
        // Instantiates the time of two Calendar variables
        Calendar cal = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        
        // Set both Calendar variables to current time
        cal.setTime(new Date());
        cal2.setTime(new Date());
        
        // Increment one Calendar variable ahead however many minutes
        // the user inputs
        System.out.println(cal.getTime());
        cal.add(Calendar.MINUTE, go);
        System.out.println(cal.getTime());
        
 
       
        // Checks current time until alarm time is reached
        while (cal2.before(cal))
        {
          cal2.setTime(new Date());
        }
        
        // Sets off the alarm sound
        alarmNoise();
        
        
        // May or may not use this later, depending if problems arise
//        
//        int remainingTime = goTime * 60;
//
//        long timeout = System.currentTimeMillis() + (remainingTime * 1000);
//        while (System.currentTimeMillis() < timeout)
//        {
//            Thread.sleep(1000);
//            System.out.println("You have: " + (timeout - System.currentTimeMillis()) / 1000 + " seconds left");
//        }
//        
//        System.out.println("PARTY TIIIIME");
        // Activate GUI window for alarm when timeout = 0
    }
    
    // Method to make a noise for the alarm
    public void alarmNoise() throws Exception
    {
        // File name
        String fileName = "alarmNoise.wav";
                
        FileInputStream in = new FileInputStream(fileName);
        AudioStream audioStream = new AudioStream(in);
        AudioPlayer.player.start(audioStream);
                
    }
    
    // Method for Snooze function, unfinished.
    public boolean Snooze()
    {
        snoozeNum++;
        return true;
    }
}
