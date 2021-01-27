package com.farsight.java_test;

public class ArrayTest3
{
	public int array[][] = null;

	public ArrayTest3()
	{
		array = new int[3][];
		array[0] = new int[3];
		array[1] = new int[1];
		array[2] = new int[2];
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				array[i][j] = i + j + 1;
			}
		}
	}

	public void printArray()
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				System.out.println("array["+i+"]["+j+"]="+array[i][j]);
			}
		}
	}
}
