package com.spencerbartz.jdatastructures;

import com.spencerbartz.jdatastructures.*;

public class LinkedListNode<T extends Comparable<T>>
{
	protected Class<T> klasse;
	protected T data;

	private LinkedListNode<T> next = null;
	private LinkedListNode<T> prev = null;	

	public LinkedListNode(Class<T> klasse, T data)
	{
		this.klasse = klasse;
		this.data = data;
		next = null;
		prev = null;
	}

	public LinkedListNode<T> getNext()
	{ 
		return next;
	}

	public LinkedListNode<T> getPrev()
	{
		return prev;
	}

	public void setNext(LinkedListNode<T> newNext)
	{
		next = newNext;
	}

	public void setPrev(LinkedListNode<T> newPrev)
	{
		prev = newPrev;
	}

	public int compareTo(LinkedListNode<T> lln)
	{
		return data.compareTo(lln.data);
	}

	public String toString()
	{
		return data.toString();
	}

	public T getData()
	{
		return data;
	}
}
