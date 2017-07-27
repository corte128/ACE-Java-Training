package com.siriuscom.training.collections;

import java.util.*;

public class CustomHashMap<K, V> 
{
	private List<List<V>> valueList;
	private List<List<K>> keyList;
	private int size;
	
	public CustomHashMap()
	{
		valueList = new ArrayList<List<V>>();
		keyList = new ArrayList<List<K>>();
		size = 0;
	}
	
	public V get(K index)
	{
		for(K key : this.keyList.get(index.hashCode()))
		{
			if(index.equals(key))
			{
				return this.valueList.get(index.hashCode()).get(
						this.keyList.get(index.hashCode()).indexOf(index));
			}
		}
		return null;
	}
	
	public void put(K index, V value)
	{
		++this.size;
		try
		{
			if(this.get(index) == null)
			{
				List<V> newSubValueList = new ArrayList<V>();
				newSubValueList.add(value);
				this.valueList.add(index.hashCode(), newSubValueList);
				
				List<K> newSubKeyList = new ArrayList<K>();
				newSubKeyList.add(index);
				this.keyList.add(index.hashCode(), newSubKeyList);
			}
			else
			{
				//A collision Occurs
				this.valueList.get(index.hashCode()).add(value);
				this.keyList.get(index.hashCode()).add(index);
			}
		}
		catch(NullPointerException e)
		{
			List<V> newSubValueList = new ArrayList<V>();
			newSubValueList.add(value);
			this.valueList.add(index.hashCode(), newSubValueList);
			
			List<K> newSubKeyList = new ArrayList<K>();
			newSubKeyList.add(index);
			this.keyList.add(index.hashCode(), newSubKeyList);
		}
	}
	
	public boolean containsKey(K index)
	{
		try
		{
			if(this.valueList.get(index.hashCode()) == null)
			{
				return false;
			}
		}
		catch(NullPointerException e)
		{
			return false;
		}
		
		for(K key : this.keyList.get(index.hashCode()))
		{
			if(index.equals(key))
			{
				return true;
			}
		}
		return false;
	}
	
	public int size()
	{
		return size;
	}
	
	
}
