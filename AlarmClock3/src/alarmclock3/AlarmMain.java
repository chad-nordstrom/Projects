
package alarmclock3;
import javax.swing.JPanel;


public class AlarmMain extends JPanel
{

	public static AlarmGUI GUIGenerator;
	
	public static void main(String[] args)
	{
//		GUIGenerator = new AlarmGUI();
//		
//		GUIGenerator.setVisible(true);
                AlarmMaker al = new AlarmMaker();
                al.minAlarm();
	}

}
