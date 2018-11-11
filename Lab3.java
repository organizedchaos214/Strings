/**
 * @author Shane Anderson
 * 
 * CSE115 Lab 3: Prompts user for their information using 
 * JOptionPane and prints the record to the console.
 */

import javax.swing.JOptionPane;

public class Lab3 
	{
	public static void printMyInfo (String Name, String Email, String Address, String Phone)
		{
		System.out.println( "**************************");
		System.out.println( Name );
		System.out.println( Email );
		System.out.println( Address );
		System.out.println ( Phone );
		System.out.println( "**************************");

		}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
		{
		String myName = " ";
		String myAddress = " ";
		String myPhone = " ";
		String myEmail = " ";
		
		myName = JOptionPane.showInputDialog("Enter Name");
		System.out.println("My Name is: " + myName);

		myAddress = JOptionPane.showInputDialog("Enter Address");
		System.out.println("My Address is: " + myAddress);
		
		myPhone = JOptionPane.showInputDialog("Enter Phone Number");
		System.out.println("My Phone Number is: " + myPhone);
		
		myEmail = JOptionPane.showInputDialog("Enter Email");
		System.out.println("My Email is: " + myEmail);
		
		//call to printMyInfo:
		printMyInfo (myName, myEmail, myAddress, myPhone);
		
		System.exit (0);
		// TODO Auto-generated method stub
		}

}
