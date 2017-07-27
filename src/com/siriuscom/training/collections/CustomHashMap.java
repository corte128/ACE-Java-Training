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
		//search for key in the list that the key's hash code indexes 
		for(K key : this.keyList.get(index.hashCode()))
		{
			if(index.equals(key))
			{
				//if the key is found use its to index to retrieve the 
				//corresponding value
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
			if(this.valueList.get(index.hashCode()) == null)
			{
				//if the index of the key's hash indexes a null value
				//then the list needs to be initialized
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
		catch(IndexOutOfBoundsException e)
		{
			//if the index of the key's hash code is out of bounds,
			//add new lists of values
			
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
		catch(IndexOutOfBoundsException e)
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
