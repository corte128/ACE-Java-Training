package com.siriuscom.training.OOP2;

public class Sphere implements Shape3D<Double>
{
	private double radius;
	public Sphere(double radius)
	{
		this.radius = radius;
	}
	public Double getVolume()
	{
		return new Double((4/3)*(Math.PI)*Math.pow(this.radius, 3));
	}
}
