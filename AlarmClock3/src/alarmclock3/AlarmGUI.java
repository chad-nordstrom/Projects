package alarmclock3;

import java.util.ArrayList;




public class AlarmGUI extends javax.swing.JFrame 
{
			
		    // Variables declaration                    
	 private javax.swing.JButton addButton;
	 private javax.swing.JList<String> jList1;
	 private javax.swing.JScrollPane jScrollPane2;
		    
	 public AlarmActionListeners alarm = new AlarmActionListeners();

	 public AddAlarmInputGUI alarmAddition;
	 
		    
	    // End of variables declaration  
	    
	    /**
	     * Creates new form TestGUI
	     */
	    public AlarmGUI() 
	    {
	        initMainComponents();
	    }


	    @SuppressWarnings("unchecked")
	    private void initMainComponents() 
	    {

	        addButton = new javax.swing.JButton();
	        jScrollPane2 = new javax.swing.JScrollPane();
	        jList1 = new javax.swing.JList<>();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        
	        //add alarm button opens new window when clicked
	        addButton.setText("Add Alarm");
	        addButton.addActionListener(new java.awt.event.ActionListener() 
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt) 
	            {
	                
	            	alarm.addAlarmButton(evt);
	            }
	        });
	        //////////
	        
	        ///alarm list for 1st window, alarms displayed in arraylist
	        jList1.setModel
	        (new javax.swing.AbstractListModel<String>() 
		        {
		            ArrayList<String> strings = new ArrayList<String>();
		            public int getSize() 
		            { 
		            	return strings.size(); 
		            }
		            
		            public String getElementAt(int i) 
		            { 
		            	return strings.get(i); 
		            }
		        }
	        );
	       
	        jScrollPane2.setViewportView(jList1);
	        
	        //layout stuff that doesnt affect functionality
	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        
	        layout.setHorizontalGroup
	        (
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(addButton)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
	                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(49, 49, 49))
	        );
	       
	        layout.setVerticalGroup
	        (
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(27, 27, 27)
	                .addComponent(addButton)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap())
	        );
	        ///////////////////
	        pack();
	    }                        
                                       
	}
	

