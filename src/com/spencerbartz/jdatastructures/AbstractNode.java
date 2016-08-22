package com.spencerbartz.jdatastructures;

abstract public class AbstractNode<T extends Comparable<T>>
{
	protected Class<T> klasse;
	protected T data;
	
	public AbstractNode(Class<T> klasse, T data)
	{
		this.klasse = klasse;
		this.data = data;
	}

	public T getData()
	{
		return this.data;
	}
}
