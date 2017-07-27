package com.siriuscom.training.generic2;

import java.util.*;

public class CountProperties
{
	//this method counts the number of odd elements in the passed in Collection
	public static <T extends HasOddProperty> int getNumOddElements(Collection<T> elements)
	{
		int count = 0;
		for(T element : elements)
		{
			if(element.isOddInteger())
				++count;
		}
		return count;
	}
	
	//this method counts the number of prime elements in the passed in Collection
	public static <T extends HasPrimeProperty> int getNumPrimeElements(Collection<T> elements)
	{
		int count = 0;
		for(T element : elements)
		{
			if(element.isPrimeNumber())
				++count;
		}
		return count;
	}
	
	//this method counts the number of palindrome elements in the passed in Collection
	public static <T extends HasPalindromeProperty> int getNumPalindromeElements(Collection<T> elements)
	{
		int count = 0;
		for(T element : elements)
		{
			if(element.isPalindrome())
				++count;
		}
		return count;
	}
}
