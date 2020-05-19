package alarmclock3;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;


public class AlarmActionListeners
{
	public AddAlarmInputGUI alarmAddition;
	
	public String[] dateInput;
	public String minutesInput;
	
	String[] parsedInfo;
	
	CopyOfAlarmMaker maker;

	
	
	public AlarmActionListeners()
	{
		
	}

	public void addAlarmButton(ActionEvent e)
	{
		alarmAddition = new AddAlarmInputGUI();
		
		alarmAddition.setVisible(true);
		
	}
	
	
	public void processAlarmInfo(String[] dateInput, String minutesInput, String message)
	{

		alarmAddition = new AddAlarmInputGUI();
		
		boolean isCorrectDate = true;
		
		int stringCount = 0;
		
		//checks if any indexes in date are strings
		for(int i = 0; i < dateInput.length - 1; i++)
		{
			if(!dateInput[i].matches("^-?\\d+$"))
			{
				isCorrectDate = false;
				stringCount++;
			}
		}
		
		//checks if theyre ALL strings (comboboxes are at default values)
		if(stringCount == 6)
		{
			isCorrectDate = true;
		}	
		/////////////
		
		if(isCorrectDate == true && minutesInput.equals(""))
		{
			parsedInfo = new String[7];
			
			for(int i = 0; i <= dateInput.length - 1; i++)
			{
				parsedInfo[i] = dateInput[i];
			}
			
			parsedInfo[6] = message;
			
			alarmAddition.dispose();
		}
		
		else if(isCorrectDate == false && minutesInput.matches("^-?\\d+$"))
		{
			parsedInfo = new String[2];
			
			parsedInfo[0] = minutesInput;
			parsedInfo[1] = message;
			
			alarmAddition.dispose();

		}
		
		
		else
		{
			JOptionPane.showMessageDialog
			(alarmAddition, "Data entered incorrectly. Please make correct changes and try again", "Oops!", JOptionPane.ERROR_MESSAGE);
		}
		
		if(parsedInfo.length == 6)
		{
			maker = new CopyOfAlarmMaker();
			try
			{
				maker.dateAlarm();
                                alarmAddition.setVisible(false);
                                alarmAddition.dispose();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
		else if(parsedInfo.length == 2)
		{
 			maker = new CopyOfAlarmMaker();
			try
			{
				maker.minAlarm();
                                alarmAddition.setVisible(false);
                                alarmAddition.dispose();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
	public String[] getAlarmInfo()
	{
		return parsedInfo;
	}

}
