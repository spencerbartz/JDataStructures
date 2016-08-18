package com.spencerbartz.jdatastructures;

import com.spencerbartz.jdatastructures.DynamicArray;

public class QuickString
{
	private DynamicArray<String> words;
	private static final int DEFAULT_SIZE = 5;
	private String outString = null;

	public QuickString()
	{
		words = new DynamicArray<String>(String.class, DEFAULT_SIZE);
	}

	public QuickString(int size)
	{
		words = new DynamicArray<String>(String.class, size);	
	}

	public void append(String s)
	{
		if(outString != null)
			outString = null;
		words.insert(s);
	}

	public boolean delete(String s)
	{
		if(outString != null)
			outString = null;
		return words.delete(s);
	}

	public void deleteAll(String s)
	{
		boolean flag = true;
		do
			flag = delete(s);
		while(flag);
	}

	// Returns cached value if present, otherwise builds string
	public String toString()
	{
		if(outString != null)
		{
			return outString;
		}
		else
		{
			String pieces[] = words.toArray();
			String fullString = "";
			for(String piece : pieces)
				fullString += piece;

			outString = fullString;			
			return fullString;
		}
	}
}

