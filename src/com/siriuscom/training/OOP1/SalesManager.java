package com.siriuscom.training.OOP1;

public class SalesManager extends SalesPerson
{
	private SalesPerson[] team;
	public SalesManager(String dateOfJoining, String name, int age, 
						double salesFigures, SalesPerson[] team)
	{
		super(dateOfJoining, name, age, salesFigures);
		this.team = team;
	}
	public SalesPerson[] getTeam()
	{
		return team;
	}
	public void setTeam(SalesPerson[] team)
	{
		this.team = team;
	}
}
