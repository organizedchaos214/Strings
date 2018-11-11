/**
 * @author Shane Anderson
 *
 * Will take in a string, and return true if it is a palindrome.
 * If it isn't, it will return false.
 * 
 * Examples/Assumptions:
 *  
 * 1. ABA - true
 * 2. ABBBA - true
 * 3. ABC - false
 * 4. ABCBBA - false
 * 5. A - true
 * 6. _ - false (null)
 */

import java.util.*;

public class validPalindrome 
	{
	public static boolean isPalindrome (String input)
		{
		System.out.println("Input string is: " + input);
		
		//empty string will be a palindrome can combine in the "catch all/false case":
		if (input.length( ) == 0)
			{
			System.out.println("False: Empty String entered");
			return false;
			}
		
		//will be a palindrome if it is one character:
		if (input.length( ) == 1)
			{
			System.out.println("True: " + input + " entered. Single characters are palindromes.");
			return true;
			}
		
		String reversedString = "";
		
		//reverse the input string and store in "reversedString":
		for (int i = input.length( ) - 1; i >= 0; i--)
			{
			reversedString += input.charAt(i);
			}
		
		System.out.println("Reversed String is: " + reversedString);
		
		//if reversedString and input string are same, true:
		if (reversedString.equals(input))
			{
			System.out.println("True: Input and Reversed Strings Match");
			return true;
			}
		
		System.out.println("False: Input and Reversed Strings Don't Match");
		return false;
		}
	
	
	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) 
		{
		System.out.println("Enter the Input String: ");
		String input;
		Scanner s = new Scanner (System.in);
		input = s.nextLine( );
		isPalindrome (input);	
		}

	}
