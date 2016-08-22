package com.spencerbartz.jdatastructures;

import com.spencerbartz.jdatastructures.AbstractNode;

public class LinkedListNode<T extends Comparable<T>> extends AbstractNode<T>	
{
	private LinkedListNode<T> next = null;
	private LinkedListNode<T> prev = null;	

	public LinkedListNode(Class<T> klasse, T data)
	{
		super(klasse, data);
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
}
