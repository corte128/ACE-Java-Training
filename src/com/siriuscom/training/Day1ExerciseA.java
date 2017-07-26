package com.siriuscom.training;

public class Day1ExerciseA {
	public static int[][] getTranspose(int[][] inputMatrix)
	{
		int n = inputMatrix.length;
		int[][] transposeMatrix = new int[n][n];
		int i, j;
		for(i = 0;i < n;++i)
		{
			for(j = 0;j < n;++j)
			{
				transposeMatrix[j][i] = inputMatrix[i][j];
			}
		}
		return transposeMatrix;
	}
}
