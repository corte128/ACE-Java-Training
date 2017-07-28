package com.siriuscom.training.date18;

import java.util.*;
public class DateToCalendar 
{
	public static Calendar convertToCalendar(Date date)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}
}
