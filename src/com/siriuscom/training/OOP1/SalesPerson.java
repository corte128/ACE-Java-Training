package com.siriuscom.training.OOP1;

public class SalesPerson extends Employee
{
	double salesFigures;
	public SalesPerson(String dateOfJoining, String name, int age, double salesFigures)
	{
		this.setDateofJoining(dateOfJoining);
		this.setName(name);
		this.setAge(age);
		this.salesFigures = salesFigures;
	}
	public double getSalesFigures()
	{
		return this.salesFigures;
	}
	public void setSalesFigures(double salesFigures)
	{
		this.salesFigures = salesFigures;
	}
}
