/**
 * @author Shane Anderson
 *
 *  CSE115 Lab 2: Write a program that prints a given
 *  string a given number of times.
 */
import java.util.*;

public class Lab2    // Class definition
	{
	@SuppressWarnings("resource")
	public static void main( String [ ] args )
        {   
		System.out.println("Enter String");
		
        String greeting = "";
        Scanner greet = new Scanner (System.in);
        greeting = greet.nextLine();
        
       
        System.out.println("How Many Times to Print String?");
        
        int count;
        Scanner printCount = new Scanner (System.in);
        count = printCount.nextInt ( );
        
        //System.out.println(greeting);

        int x = 0;
        
	    // Count to n:
        while (x < count)
        	{
            x = x + 1;
            System.out.println(greeting);
            } // end while
        
        }   //  end main
	
	}	//end class
