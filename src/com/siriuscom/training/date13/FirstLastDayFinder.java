package com.siriuscom.training.date13;

import java.util.*;
import java.text.*;

public class FirstLastDayFinder {
	public static void printFirstLastDay(int numMonths)
	{
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		for(int i = 0;i < numMonths;++i)
		{
			
		}
	}
}
