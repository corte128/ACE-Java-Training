package com.siriuscom.training;

public class Day1ExerciseJ 
{
	static int[] fibNums = new int[20];
	public static int getFibNum(int i)
	{
		return fibNums[i];
	}
	public static int fibonacci(int i)
	{
		if(i == 1 || i == 2)
		{
			fibNums[i - 1] = 1;
			return 1;
		}
		else
		{
			int temp = fibonacci(i - 2) + fibonacci(i - 1);
			fibNums[i - 1] = temp;
			return temp;
		}
		
	}
	public static void printFibonacciNumbers()
	{
		fibonacci(20);
		for(int i = 0;i < 20;++i)
		{
			System.out.print(getFibNum(i) + " ");
		}
	}
}
