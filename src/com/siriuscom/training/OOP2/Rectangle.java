package com.siriuscom.training.OOP2;

public class Rectangle implements Shape2D<Double>
{
	private double side1Length, side2Length;
	public Rectangle(double side1Length, double side2Length)
	{
		this.side1Length = side1Length;
		this.side2Length = side2Length;
	}
	public Double getArea()
	{
		return new Double(this.side1Length*this.side2Length);
	}
}
