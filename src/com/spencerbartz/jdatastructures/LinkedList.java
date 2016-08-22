package com.spencerbartz.jdatastructures;

public class LinkedList<T extends Comparable<T>>
{
	private LinkedListNode<T> head = null;
	private int length = 0;

	public LinkedList(LinkedListNode<T> lln)
	{
		head = lln;
		head.setNext(head);
		head.setPrev(head);
		length++;
	}

	public LinkedList()
	{
	
	}

	public int getLength()
	{
		return length;
	}

	public void insert(LinkedListNode<T> lln)
	{
		if(head == null)
		{
			head = lln;
		}
		else
		{
			head.getPrev().setNext(lln);
		}
		
		length++;
	}
}
