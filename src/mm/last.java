package mm;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class last implements ActionListener
		{
		    static JLabel text;
		    //Driver function
		    public static void main(String args[])
		    {
		   
		 
			//Create a frame
		
		    	
			JFrame frame = new JFrame("Menu");
			frame.setSize(500,500);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(new FlowLayout());
			
			
			//Create an object
			last obj = new last();
			
			
			//Create a Menu
			JMenu menu = new JMenu("Products Here");
			
			
			//Create Menu Items1
			JMenuItem item[] = new JMenuItem[5];
			for(int i=0;i<5;i++)
			{
			    item[i]=new JMenuItem("Item "+(i+1));
			    item[i].addActionListener((ActionListener) obj);
			    menu.add(item[i]);
			}
			
			
			
			//Create a menu bar
			JMenuBar mb=new JMenuBar();
			mb.add(menu);
			frame.setJMenuBar(mb);
			
			
			//Create the label
			text = new JLabel();
			frame.add(text);
			
			
			//Display the frame
			frame.setVisible(true);
		    }
		    
		    
		    private static void viewUsers() {
				// TODO Auto-generated method stub
				
			}


			//Function to display the menu item selected
		    public void actionPerformed(ActionEvent e)
		    {
		    	
		    	text.setText("Menu Item Selected : "+e.getActionCommand());
		    	
			}
		}


	

