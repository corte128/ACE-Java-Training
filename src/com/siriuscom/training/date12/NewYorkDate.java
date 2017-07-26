package com.siriuscom.training.date12;

import java.text.*;
import java.util.*;
public class NewYorkDate {
	public static String getDateInNewYork()
	{
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat formatter = new SimpleDateFormat("h:m a");
		formatter.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		return formatter.format(cal.getTime());
	}
}
