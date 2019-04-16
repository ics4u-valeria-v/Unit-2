import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JRootPane;

import java.awt.event.ActionListener;
import java.util.Stack;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;

public class Stacks {

	private JFrame frmStacks;
	private JTextField txtInteger;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stacks window = new Stacks();
					window.frmStacks.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Stacks() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStacks = new JFrame();
		frmStacks.setTitle("Stack Program");
		frmStacks.setBounds(100, 100, 289, 239);
		frmStacks.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStacks.getContentPane().setLayout(null);
		
		JLabel lblInstr = new JLabel("Please enter an integer:");
		lblInstr.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInstr.setBounds(10, 25, 164, 45);
		frmStacks.getContentPane().add(lblInstr);
		
		txtInteger = new JTextField();
		txtInteger.setBounds(177, 38, 86, 20);
		frmStacks.getContentPane().add(txtInteger);
		txtInteger.setColumns(10);
		
		
		//JScrollPane scrollList = new JScrollPane();
		//Create the list
		JList list = new JList();
		//scrollList.setViewportView(list);
		list.setValueIsAdjusting(true);
		
		DefaultListModel numList = new DefaultListModel();
		list.setModel(numList);
		list.setBounds(10, 104, 253, 82);
		
		frmStacks.getContentPane().add(list);
		
		
		//declare the stack
		Stack intStack = new Stack();
		
		
		JButton btnPush = new JButton("Add value");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//declare global variables
				int userAnsw = 0;
				
				//get the values from the text box and check of they are integers
				try
				{
					userAnsw = Integer.parseInt(txtInteger.getText());
					System.out.println(userAnsw);
						intStack.push(userAnsw);
						
						//add the answer to the list 
						numList.addElement(userAnsw);
						
						
					
				}
				catch(Exception e)
				{
					System.out.println("Enter an integer ");
				}
				
				
				
			}
		});
		btnPush.setBounds(31, 70, 89, 23);
		frmStacks.getContentPane().add(btnPush);
		
		JButton btnPop = new JButton("Pop Top Value");
		btnPop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnPop.setBounds(141, 70, 106, 23);
		frmStacks.getContentPane().add(btnPop);
		
		
	}
}
