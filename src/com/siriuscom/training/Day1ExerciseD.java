package com.siriuscom.training;

import java.io*;

public class Day1ExerciseD
{
	public static String convertBytes(double bytes)
	{
		if(bytes%1000000000 > 0 )
		{
			return (bytes/1000000000) + " GB";
		}
		if(bytes%1000000 > 0)
		{
			return (bytes/1000000) + " MB";
		}
		if(bytes%1000 > 0)
		{
			return (bytes/1000) + " KB";
		}
		return bytes + " bytes";
	}
}
