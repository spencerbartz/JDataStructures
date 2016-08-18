package com.spencerbartz.jdatastructures;

import java.lang.reflect.Array;

public class DynamicArray<T extends Comparable<T>>
{
	private T ary[];
	private Class<T> klasse;

	public DynamicArray(Class<T> klasse, int size)
	{
		@SuppressWarnings("unchecked")
		final T[] ary = (T[]) Array.newInstance(klasse, size);
		this.ary = ary;
		this.klasse = klasse;
	}

	public T[] toArray()
	{
		@SuppressWarnings("unchecked")
		T[] newAry = (T[]) Array.newInstance(klasse, getSize());

		int j = 0;
		for(int i = 0; i < ary.length; i++)
			if(ary[i] != null)
				newAry[j++] = ary[i];

		return newAry;
	}

	public int getSize()
	{
		int size = 0;

		for(int i = 0; i < ary.length; i++)
			if(ary[i] != null)
				size++;

		return size;
	}

	public int getCapacity()
	{
		return ary.length;
	}

	public void insert(T t)
	{
		if(getSize() == ary.length)
			resizeArray();

		for(int i = 0; i < ary.length; i++)
			if(ary[i] == null) 
			{
				ary[i] = t;
				break;
			}
	}

	public boolean delete(T t)
	{
		for(int i = 0; i < ary.length; i++)
			if(ary[i] != null && ary[i].compareTo(t) == 0)
			{
				ary[i] = null;
				return true;
			}

		return false;		
	}

	private void resizeArray()
	{
		@SuppressWarnings("unchecked")
		T[] newAry = (T[]) Array.newInstance(klasse, ary.length * 2);

		for(int i = 0; i < ary.length; i++)
			newAry[i] = ary[i];		

		ary = newAry;
	}

	public void printAll()
	{
		for(int i = 0; i < ary.length; i++)
			System.out.println("[" + i + "] " + ary[i]);
	}
}

