package com.spencerbartz.jdatastructures;

import java.lang.reflect.Array;

public class HashTable<T>
{
	private T ary[];
	private Class<T> klasse;
	private int count;	
	private static final int DEFAULT_SIZE = 100;

	public HashTable(Class<T> klasse, int size)
	{
		init(klasse, size);
	}

	public HashTable(Class<T> klasse)
	{
		init(klasse, DEFAULT_SIZE);
	}

	private void init(Class<T> klasse, int size)
	{
		@SuppressWarnings("unchecked")
		final T[] ary = (T[]) Array.newInstance(klasse, size);
		this.ary = ary;
		this.klasse = klasse;
		count = 0;	
	}

	public int getCount()
	{
		return count;
	}

	public int hash(T t)
	{
		return t.hashCode() % ary.length;
	}
}
