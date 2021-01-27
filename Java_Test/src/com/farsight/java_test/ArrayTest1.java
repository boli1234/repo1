package com.farsight.java_test;

public class ArrayTest1
{
	public int array[] = null;
	// public int[] array;

	public ArrayTest1()
	{
		// array = new int[]{1,2,3};
		array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
	}

	public void printArray()
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("array[" + i + "]=" + array[i]);
		}
	}
}
