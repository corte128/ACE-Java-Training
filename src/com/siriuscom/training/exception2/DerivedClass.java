package com.siriuscom.training.exception2;

public class DerivedClass extends BaseClass 
{
	public DerivedClass()
	{
		try
		{
			super();
		}
		catch(Exception e)
		{
			System.out.print(0);
		}
	}
}
