import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

import java.awt.event.ActionListener;
import java.util.Stack;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.Color;

public class Stacks {

	private JFrame frmStacks;
	private JTextField txtInteger;
	
	//--GLOBAL VARIABLES--//	

	//call the stack from a different file
	StackIntegers stacks = new StackIntegers();
	

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
		frmStacks.setBounds(100, 100, 307, 350);
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
		list.setBackground(new Color(218, 165, 32));
		//scrollList.setViewportView(list);
		list.setValueIsAdjusting(true);
		
		DefaultListModel numList = new DefaultListModel();
		list.setModel(numList);
		list.setBounds(72, 140, 126, 114);
		
		frmStacks.getContentPane().add(list);
		
		JLabel lblPeek = new JLabel("Peeked value:");
		lblPeek.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPeek.setBounds(10, 265, 126, 45);
		frmStacks.getContentPane().add(lblPeek);
		
		JLabel lblPop = new JLabel("Poped value:");
		lblPop.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPop.setBounds(155, 265, 126, 45);
		frmStacks.getContentPane().add(lblPop);
		
		
		
		JButton btnPush = new JButton("Add Value");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//clear the list box
				numList.clear();
				
				//declare local variables
				int userAnsw = 0;
				Stack<Integer> getStack =  new Stack<Integer>();
				
				//check if the user entered an integer
				try {
					//check if the user didn't enter anything
					if (txtInteger.getText().equals("")){
						//add the answer to the list 
						JOptionPane.showMessageDialog(null,"Warning: Stack is Empty","Stacks Warning",JOptionPane.WARNING_MESSAGE);
					     }
					else
					{
						//get the values from the text box and check of they are integers
						userAnsw = Integer.parseInt(txtInteger.getText());
						
						//call push function
						getStack = stacks.pushStack(userAnsw);
						
						//loop through each element in the stack and display to the text box
						 for (int integerStack : getStack)
						 {
							//add the answer to the list 
								numList.addElement(integerStack);	
						 }
							
						
					}
					
				}
				//if the user entered anything different anything different than an integer
				catch (Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Invalid Input: Enter Integer","Stacks Error",JOptionPane.ERROR_MESSAGE);
				};
				
				
				
				
			}
		});
		btnPush.setBounds(10, 70, 110, 23);
		frmStacks.getContentPane().add(btnPush);
		
		JButton btnPop = new JButton("Pop Top Value");
		btnPop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int popedVal = 0;
				//clear the list box
				numList.clear();
				
				//declare local variables
				Stack<Integer> getStack =  new Stack<Integer>();
				
				//get the top value of the stack that will be popped
				int popVal = stacks.peekStack();
				
				//display the popped value
				lblPop.setText("Popped Value: "+popVal);
				
				//call pop function
				getStack = stacks.popStack(popedVal);
				
				//loop through each element in the stack and display to the text box
				 for (int integerStack : getStack)
				 {
					//add the answer to the list 
						numList.addElement(integerStack);	
				 }
				
				
			}
		});
		btnPop.setBounds(144, 70, 137, 23);
		frmStacks.getContentPane().add(btnPop);
		
		JButton btnPeek = new JButton("Peek Top Value");
		btnPeek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get the top value of the stack 
				int topVal = stacks.peekStack();
				
				//display the popped value
				lblPeek.setText("Peeked Value: " + topVal);
			}
		});
		btnPeek.setBounds(144, 106, 137, 23);
		frmStacks.getContentPane().add(btnPeek);
		
		JButton btnClear = new JButton("Clear Stack");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//clear the list box
				numList.clear();
				//declare local variables
				Stack<Integer> getStack =  new Stack<Integer>();
				//call clear function
				getStack = stacks.clearStack();
				
				//loop through each element in the stack and display to the text box
				 for (int integerStack : getStack)
				 {
					//add the answer to the list 
						numList.addElement(integerStack);	
				 }
			}
		});
		btnClear.setBounds(10, 106, 110, 23);
		frmStacks.getContentPane().add(btnClear);
		
		
		
	}
}
