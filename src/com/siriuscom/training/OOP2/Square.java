package com.siriuscom.training.OOP2;

public class Square implements Shape2D<Double>
{
	private double sideLength;
	public Square(double sideLength)
	{
		this.sideLength = sideLength;
	}
	public Double getArea()
	{
		return new Double(Math.pow(sideLength, 2));
	}
}
