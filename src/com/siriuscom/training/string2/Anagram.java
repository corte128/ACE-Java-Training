package com.siriuscom.training.string2;

import java.util.*;
public class Anagram {
	public static boolean areAnagrams(String one, String two)
	{
		//if the lengths of the strings are different then they cannot be anagrams
		if(one.length() != two.length())
		{
			return false;
		}
		
		//initialize maps to count the number of each character in each string
		HashMap<Character, Integer> lettersOne = new HashMap<Character, Integer>();
		HashMap<Character, Integer> lettersTwo = new HashMap<Character, Integer>(); 
		
		int i;
		
		//counts the specific characters in one
		for(i = 0;i < one.length();++i)
		{
			try
			{
				lettersOne.put(one.charAt(i), new Integer(((int)lettersOne.get(one.charAt(i)) + 1)));
			}
			catch(NullPointerException e)
			{
				lettersOne.put(one.charAt(i), 0);
			}
			
		}
		
		//counts the specific characters in two
		for(i = 0;i < two.length();++i)
		{
			try
			{
				lettersTwo.put(two.charAt(i), new Integer(((int)lettersTwo.get(two.charAt(i)) + 1))); 
			}
			catch(NullPointerException e)
			{
				lettersTwo.put(two.charAt(i), 0);
			}
		}
		
		return lettersOne.equals(lettersTwo);
	}
}
