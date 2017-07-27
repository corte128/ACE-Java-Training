package com.siriuscom.training.generic5;

import java.util.*;
public class MaxValue 
{
	public <T extends Comparable<T>> T getMaximum(List<T> elements)
	{
		return Collections.max(elements);
	}
}
