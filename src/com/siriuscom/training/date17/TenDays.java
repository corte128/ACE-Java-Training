package com.siriuscom.training.date17;

import java.util.*;
public class TenDays {
	
	public static void printTenDayDates()
	{
		Calendar today = Calendar.getInstance();
		
		//This method adds 10 days to the current date and prints 
		//the current day and month
		today.add(Calendar.DAY_OF_MONTH, 10);
		System.out.println("10 days from now: " + today.get(Calendar.DAY_OF_MONTH)
			+ " of " + today.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()));
		
		//This method subtracts 20 days(10 of which to correct for the previous add)
		//to the current date and prints the current day and month
		today.add(Calendar.DAY_OF_MONTH, -20);
		System.out.println("10 days ago: " + today.get(Calendar.DAY_OF_MONTH)
			+ " of " + today.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()));
		
	}
}
