package com.siriuscom.training.OOP2;

public class Circle implements Shape2D<Double>
{
	private double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public Double getArea()
	{
		return new Double((Math.PI)*Math.pow(radius, 2));
	}
	
}
