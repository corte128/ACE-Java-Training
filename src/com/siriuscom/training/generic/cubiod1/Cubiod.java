package com.siriuscom.training.generic.cubiod1;

public class Cubiod<T extends Number>
{
	T length;
	T breadth;
	T height;
	public Cubiod(T length, T breadth, T height)
	{
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	public double getVolume()
	{
		return ((double)length)*((double)breadth)*((double)height);
	}
	
	public String toString()
	{
		return "Length: " + this.length + " Breadth: "
				+ this.breadth + " Height: " + this.height;
	}
}
