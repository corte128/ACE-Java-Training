package com.siriuscom.training.generic3;

import java.util.*;

public class RandomPrint<T> 
{
	//this method prints the contents of arguments in random order
	public void printRandomly(T[] arguments)
	{
		//randomize the order of the elements in arguments
		ArrayList<T> shuffler = new ArrayList<T>(Arrays.asList(arguments));
		Collections.shuffle(shuffler);
		
		//output using enhanced for loop
		for(T arg : shuffler)
		{
			System.out.print(arg);
		}
		
		//line break
		System.out.println();
		
		//output using streams
		shuffler.forEach(System.out::println);
		
	}
}