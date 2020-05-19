//package alarmclock3;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//
///**
// *
// * @author marlf
// */
//
//import java.io.FileInputStream;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.Scanner;
//
//import javax.swing.JOptionPane;
//
//import sun.audio.AudioPlayer;
//import sun.audio.AudioStream;
//
//public class CopyOfAlarmMaker {
//    
//    int alarmHour = 0;
//    int alarmMin = 0;
//    boolean snooze = false;
//    int snoozeNum = 0;
//    Scanner myIn = new Scanner(System.in);
//    
//	boolean snoozed = false;
//    
//    AlarmActionListeners passedData;
//    
//    String[] parsedData;
//    
//    public CopyOfAlarmMaker()
//    {
//    	passedData = new AlarmActionListeners();
//        parsedData = passedData.getAlarmInfo();
//    }
//    
//    // Actually probably not a necessary method, may remove
//    public void setAlarm(int hour, int min)
//    {
//     alarmHour = hour;
//     alarmMin = min;
//    }
//    
//    // set an alarm for a certain date and time, may edit for easier input
//    public void dateAlarm() throws Exception
//    {
//        
//        Date date = new Date();
//        String userDate = "";
//        
//        // set alarm based on passed data from gui classes
//        
//        userDate = parsedData[0] + "-" + parsedData[1] + "-" + parsedData[2] + " " + parsedData[3] + ":" + parsedData[4] + " " + parsedData[5];
//        
//        if(snoozed = true)
//        {
//        	Integer min = Integer.parseInt(parsedData[4]) + 1;
//        	String newMin = min.toString();
//        	
//        	parsedData[4] = newMin;
//        	
//        	snoozed = false;
//        }
//
//        // Definies the format necessary for user input to Date class
//        SimpleDateFormat alarmDate = new SimpleDateFormat("dd-MM-yyyy hh:mm a");
//        String alarm = userDate;
//        
//        // May use this later
////        String alarm = day + "-" + month + "-" + "2016" + " " + hour + ":" 
////                + min + ":" + "00";
//
//        
//        try
//        {
//            // Simply parses and prints out the alarm date, may remove later
//            Date newDate = alarmDate.parse(alarm);
//            System.out.println(newDate);
//            
//            // Checks if the alarm date/time is before the current time
//            // then restarts the method if true
//            if (newDate.before(date)) 
//            {
//            System.out.println("YOU CREATED A TIME PARADOX!");
//            dateAlarm();
//            } 
//            else
//            {
//                // Checks current time until alarm time is reached
//                while (date.before(newDate))
//                {
//                    date = new Date();
//                }
//                // Plays Alarm Noise
//                
//                Object[] options = {"Turn off", "Snooze"};
//                
//                int choice = JOptionPane.showOptionDialog(null, parsedData[6]  + "Times snoozed: " + snoozeNum, "Alarm", JOptionPane.OK_CANCEL_OPTION, 
//                		JOptionPane.WARNING_MESSAGE, null, options, options[0]);
//                
//                alarmNoise();
//                int addMinuteTime = 1;
//                Date targetTime = new Date();
//                targetTime = DateUtils.addMinutes(targetTime, addMinuteTime);
//                if(choice == 1)
//                {
//                	snoozeNum++;
//                	
//                	snoozed = true;
//                	
//                	dateAlarm();
//                }
//            }
//        } catch (ParseException e)
//        {
//            e.printStackTrace();
//        }
//        
//        
//  
//        }
//    
//    // Makes a alarm to be set off in X minutes
//    public void minAlarm() throws Exception
//    {
////        System.out.println("Please Enter how many minutes from now"
////                + " you would like the alarm to sound.");
//
//    	
//    	int go = Integer.parseInt(parsedData[0]);
//    	
//    	if(snoozed == true)
//    	{
//    		go = 1;
//    		
//    		snoozed = false;
//    	}
//    	
//        
//        // Instantiates the time of two Calendar variables
//        Calendar cal = Calendar.getInstance();
//        Calendar cal2 = Calendar.getInstance();
//        
//        // Set both Calendar variables to current time
//        cal.setTime(new Date());
//        cal2.setTime(new Date());
//        
//        // Increment one Calendar variable ahead however many minutes
//        // the user inputs
//        System.out.println(cal.getTime());
//        cal.add(Calendar.MINUTE, go);
//        System.out.println(cal.getTime());
//        System.out.println(Calendar.HOUR_OF_DAY);
//        // Snooze not yet functional
////        boolean alarm = false;
//        
////        if (snooze == true)
////        {
////            cal.add(Calendar.MINUTE, 1);
////        }
//       
//        // Checks current time until alarm time is reached
//        while (cal2.before(cal))
//        {
//          cal2.setTime(new Date());
//        }
//        
//        // Sets off the alarm sound
//        
//        snoozed = false;
//        
//        Object[] options = {"Turn off", "Snooze"};
//        
//        int choice = JOptionPane.showOptionDialog(null, parsedData[6] + "Times snoozed: " + snoozeNum, "Alarm", JOptionPane.OK_CANCEL_OPTION, 
//        		JOptionPane.WARNING_MESSAGE, null, options, options[0]);
//              
//        alarmNoise();
//        
//        if(choice == 1)
//        {
//        	snoozed = true;
//        	
//        	snoozeNum++;
//        	
//        	minAlarm();
//
//        }
//        
//        
//        // May or may not use this later, depending if problems arise
////        
////        int remainingTime = goTime * 60;
////
////        long timeout = System.currentTimeMillis() + (remainingTime * 1000);
////        while (System.currentTimeMillis() < timeout)
////        {
////            Thread.sleep(1000);
////            System.out.println("You have: " + (timeout - System.currentTimeMillis()) / 1000 + " seconds left");
////        }
////        
////        System.out.println("PARTY TIIIIME");
//        // Activate GUI window for alarm when timeout = 0
//    }
//    
//    // Method to make a noise for the alarm
//    public void alarmNoise() throws Exception
//    {
//        // File name
//        String fileName = "alarmNoise.wav";
//                
//        FileInputStream in = new FileInputStream(fileName);
//        AudioStream audioStream = new AudioStream(in);
//        AudioPlayer.player.start(audioStream);
//                
//    }
//    
//    // Method for Snooze function, unfinished.
//    public boolean Snooze()
//    {
//        snoozeNum++;
//
//        return true;
//    }
//    
//
//}
