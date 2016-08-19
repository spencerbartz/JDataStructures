package com.spencerbartz.jdatastructures;

public class Node<T extends Comparable<T>>
{
	private Class<T> klasse;
	private T t;

	public Node(Class<T> klasse, T t)
	{
		this.klasse = klasse;
		this.t = t;
	}

	public T getData()
	{
		return t;
	}
}
