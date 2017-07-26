package com.siriuscom.training.date15;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormatter {
	public static void printDate()
	{
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("h:m a");
	}
}
