package com.siriuscom.training.generic3;

import java.util.*;

public class RandomPrint<T> 
{
	//this method prints the contents of arguments in random order
	public void printRandomly(T[] arguments)
	{
		ArrayList<T> shuffler = new ArrayList<T>(Arrays.asList(arguments));
		Collections.shuffle(shuffler);
		for(T arg : shuffler)
		{
			System.out.print(arg);
		}
		System.out.println();
		
	}
}
