package com.siriuscom.training;

public class Day1ExerciseB {
	public static double getGrade(double points)
	{
		double grade = 0;
		
		double i;
		for(i = 0;i <= 120;i += 0.5)
		{
			
			if(i <= 49.5)
			{
				System.out.println(i + " " + 5.0);
			}
			else if(i <= 59.5)
			{
				System.out.println(i + " " + 4.7);
			}
			else if(i <= 64.5)
			{
				System.out.println(i + " " + 4.0);
			}
			else if(i <= 69.5)
			{
				System.out.println(i + " " + 3.7);
			}
			else if(i <= 74.5)
			{
				System.out.println(i + " " + 3.3);
			}
			else if(i <= 79.5)
			{
				System.out.println(i + " " + 3.0);
			}
			else if(i <= 84.5)
			{
				System.out.println(i + " " + 2.7);
			}
			else if(i <= 89.5)
			{
				System.out.println(i + " " + 2.3);
			}
			else if(i <= 94.5)
			{
				System.out.println(i + " " + 2.0);
			}
			else if(i <= 99.5)
			{
				System.out.println(i + " " + 1.7);
			}
			else if(i <= 104.5)
			{
				System.out.println(i + " " + 1.3);
			}
			else if(i <= 120)
			{
				System.out.println(i + " " + 1.0);
			}
		}
		if(points <= 49.5)
		{
			
			grade = 5.0;
		}
		else if(points <= 59.5)
		{
			grade = 4.7;
		}
		else if(points <= 64.5)
		{
			grade = 4.0;
		}
		else if(points <= 69.5)
		{
			grade = 3.7;
		}
		else if(points <= 74.5)
		{
			grade = 3.3;
		}
		else if(points <= 79.5)
		{
			grade = 3.0;
		}
		else if(points <= 84.5)
		{
			grade = 2.7;
		}
		else if(points <= 89.5)
		{
			grade = 2.3;
		}
		else if(points <= 94.5)
		{
			grade = 2.0;
		}
		else if(points <= 99.5)
		{
			grade = 1.7;
		}
		else if(points <= 104.5)
		{
			grade = 1.3;
		}
		else if(points <= 120)
		{
			grade = 4.0;
		}
		return grade;
	}
}
