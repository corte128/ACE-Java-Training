package com.siriuscom.training.exception4;

import java.io.*;
import java.util.*;

public class AverageMarks 
{
	//this function asks users for their score and stores it in the
	//passed in list
	private static void getScore(int scoreNumber, ArrayList<Integer> scores, BufferedReader input) 
			throws IOException, NegativeNumberException, NumberOutOfBoundsException
	{
		System.out.print("Please enter score " + scoreNumber + ": ");
		int score = Integer.parseInt(input.readLine());
		if(score < 0)
		{
			throw new NegativeNumberException("Please enter a non-negative value");
		}
		if(score > 100)
		{
			throw new NumberOutOfBoundsException("Please enter a value between 0 and 100");
		}
		scores.add(score);
	}
	public static void getAverageMarks()
	{
		BufferedReader input = new BufferedReader(
				new InputStreamReader(System.in));
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		//this variable represents the current score number
		//being collected
		int count = 1;
		
		//this loop allows for the score collecting to continue 
		//when an error occurs
		try
		{
			while(true)
			{
				try
				{
					//this loop continues the prompting for scores
					//until 10 legitiment values are entered
					while(count < 11)
					{
						getScore(count, scores, input);
						++count;
					}
					
					//calculate the sum of the scores
					int sum = 0;
					for(Integer i : scores)
					{
						sum += i;
					}
					
					//get the average score
					double average = ((double)sum)/10;
					
					//print the score
					System.out.println(average);
					
					//break out of outer while loop since the
					//method has finished excecution
					break;
				}
				catch(NegativeNumberException e)
				{
					System.out.println(e);
				}
				catch(NumberOutOfBoundsException e)
				{
					System.out.println(e);
				}
				catch(NumberFormatException e)
				{
					System.out.println("Please enter an integer");
				}
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				input.close();
			}
			catch(IOException e)
			{
			}
		}
	}
}
