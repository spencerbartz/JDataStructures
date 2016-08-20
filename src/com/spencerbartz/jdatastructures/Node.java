package com.spencerbartz.jdatastructures;

public class Node<T>
{
	protected Class<T> klasse;
	protected T data;

	public Node(Class<T> klasse, T data)
	{
		this.klasse = klasse;
		this.data = data;
	}

	public T getData()
	{
		return data;
	}
}
