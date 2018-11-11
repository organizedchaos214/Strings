/**
 * @author Shane Anderson
 *
 * Implementation of Leetcode Exercise #771: Jewels and Stones.
 * 
 * Description: You're given strings J representing the types of stones that are jewels, 
 * and S representing the stones you have.  Each character in S is a type of stone you have.  
 * You want to know how many of the stones you have are also jewels.
 * 
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. 
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * 
 * Example 1:
 * 
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * 
 * Example 2:
 * 
 * Input: J = "z", S = "ZZ"
 * Output: 0
 * 
 * Note:
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 */

import java.util.*;

public class jewelsAndStones 
	{
	public int numJewelsInStones(String J, String S) 
		{
		HashMap <Character,Integer> hm = new HashMap <Character,Integer> ( );
	       
		int count = 0;
		int j,s;			

		//insert jewel characters (j) into hashmap:
	    for (j = 0; j < J.length( ); j++)
	    	{
	    	hm.put(J.charAt(j),j);	    
	        }
	    
	    //check for jewels within stones:
	    for (s = 0; s < S.length( ); s++)
	    	{
	        if (hm.containsKey(S.charAt(s)) == true)
	        	{
	        	count = count + 1;
	        	}
	    	}
	        
	    System.out.println("Count is: " + count);
	    	
	    return count;  
	    }
	   
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
		{
		String J = "aA";		//change Jewels to desired string here
		String S = "aAAbbbb";	//change Stones to desired string here
		
		jewelsAndStones js = new jewelsAndStones ( );
		js.numJewelsInStones(J, S);
		}
	}
