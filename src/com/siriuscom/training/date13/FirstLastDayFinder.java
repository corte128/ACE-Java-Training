package com.siriuscom.training.date13;

import java.util.*;
import java.text.*;

public class FirstLastDayFinder {
	public static void printFirstLastDay(int numWeeks)
	{
		Calendar cal = Calendar.getInstance();
		int[] firstDayDates = new int[numWeeks];
//		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		for(int i = 0;i < numWeeks;++i)
		{
			System.out.println((cal.get(Calendar.DAY_OF_MONTH) - 1) + " " + cal.get(Calendar.DAY_OF_MONTH));
			cal.add(Calendar.DAY_OF_MONTH, 7);
		}
	}
}

