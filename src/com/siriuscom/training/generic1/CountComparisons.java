package com.siriuscom.training.generic1;

public class CountComparisons<T extends Comparable> {

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
