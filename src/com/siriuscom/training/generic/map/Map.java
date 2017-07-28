package com.siriuscom.training.generic.map;

public class Map<K, V>
{
	K key;
	V value;
	
	public Map(K key, V value)
	{
		this.key = key;
		this.value = value;
	}
	
	public String toString()
	{
		return "|| " + key + " || " + value + " ||";
	}
}
