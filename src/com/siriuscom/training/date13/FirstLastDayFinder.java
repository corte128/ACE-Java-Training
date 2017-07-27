package com.siriuscom.training.date13;

import java.util.*;
import java.text.*;

public class FirstLastDayFinder {
//	this function prints the first and last days of the current week and the specified number of 
//	weeks in the future
	public static void printFirstLastDay(int numWeeks)
	{
		Calendar cal = Calendar.getInstance();
		int[] firstDayDates = new int[numWeeks];
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		for(int i = 0;i < numWeeks;++i)
		{
			System.out.println(cal.get(Calendar.DAY_OF_MONTH) + " " + (cal.get(Calendar.DAY_OF_MONTH) + 6));
			cal.add(Calendar.DAY_OF_MONTH, 7);
		}
	}
}

