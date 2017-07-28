package com.siriuscom.training.exception4;

import java.io.*;
import java.util.*;

public class AverageMarks 
{
	//this function asks users for their score and stores it in the
	//passed in list
	private static void getScore(int scoreNumber, ArrayList<Integer> scores, BufferedReader input) throws IOException
	{
		System.out.print("Please enter score " + scoreNumber + ": ");
		String score = input.readLine();
		scores.add(Integer.parseInt(score));
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
		while(true)
		{
			try
			{
				//this loop continues the prompting for scores
				//until 10 legitament values are entered
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
			catch(NumberFormatException e)
			{
				System.out.println("Please enter an integer");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
