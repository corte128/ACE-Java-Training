package com.siriuscom.training;

public class Day1ExerciseC {
	static int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static String getDay(int day, int month, int year)
	{
		int daysSinceMarch1900 = (year - 1900)*365;
		daysSinceMarch1900 += (year - 1900)/4;
		if(year%4 == 0 && (month == 1 || month == 2))
		{
			daysSinceMarch1900 -= 1;
			
		}
		for(int i = 0;i < month - 1;++i)
		{
			daysSinceMarch1900 += daysPerMonth[i];
		}
		daysSinceMarch1900 += day;
		int curDay = daysSinceMarch1900%7;
		switch(curDay)
		{
			case 0: return "Sunday";
			case 1: return "Monday";
			case 2: return "Tuesday";
			case 3: return "Wednesday";
			case 4: return "Thursday";
			case 5: return "Friday";
			case 6: return "Saturday";
		}
		return "No result found";
	}
}
