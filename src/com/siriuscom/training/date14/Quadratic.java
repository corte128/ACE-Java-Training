package com.siriuscom.training.date14;

//this class contains a function that solves for and prints the roots of a quadratic equation
public class Quadratic {
	public void printSolution(double A, double B, double C)
	{
		double squareRootPart = Math.sqrt(Math.pow(B,  2) - 4*A*C);
		double root1 = (-B + squareRootPart)/(2*A);
		double root2 = (-B - squareRootPart)/(2*A);
		System.out.println(root1);
		System.out.println(root2);
	}
}
