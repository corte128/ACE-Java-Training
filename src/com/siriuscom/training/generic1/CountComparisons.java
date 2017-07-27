package com.siriuscom.training.generic1;

public class CountComparisons<T extends Comparable> {

	//this method counts the number of elements in things that are greater than elm
	public int compareGeneric(T[] things, T elm)
	{
		int count = 0;
		for(int i = 0;i < things.length;++i)
		{
			if(things[i].compareTo(elm) > 0)
			{
				++count;
			}
		}
		return count;
	}
}
