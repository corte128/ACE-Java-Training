package com.siriuscom.training.OOP1;

public abstract class Employee {
	private String dateOfJoining;
	private String name;
	private int age;
	
	public String getDateOfJoining()
	{
		return this.dateOfJoining;
	}
	public void setDateofJoining(String dateOfJoining)
	{
		this.dateOfJoining = dateOfJoining;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
}
