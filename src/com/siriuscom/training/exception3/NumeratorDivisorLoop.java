package com.siriuscom.training.exception3;

import java.io.*;
public class NumeratorDivisorLoop {
	public static void divide()
	{
		BufferedReader input = new BufferedReader(
				new InputStreamReader(System.in));
		
		while(true)
		{
			try
			{
				System.out.print("Please enter numerator: ");
				String numerator = input.readLine();
				if(numerator.equals("q") || numerator.equals("Q"))
				{
					break;
				}
				
				System.out.print("Please enter denominator: ");
				String denominator = input.readLine();
				if(denominator.equals("q") || denominator.equals("Q"))
				{
					break;
				}
				
				int n = Integer.parseInt(numerator);
				int d = Integer.parseInt(denominator);
				int answer = n/d;
				System.out.println(answer);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
