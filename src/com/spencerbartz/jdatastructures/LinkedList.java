package com.spencerbartz.jdatastructures;

public class LinkedList<T extends Comparable<T>>
{
	private LinkedListNode<T> head;
	private int length;

	public LinkedList(LinkedListNode<T> lln)
	{
		head = lln;
		head.setNext(null);
		head.setPrev(null);
		length = 1;
	}

	public LinkedList()
	{
		head = null;
		length = 0;
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
			LinkedListNode<T> cursor = head;

			while(cursor.getNext() != null)
				cursor = cursor.getNext();
			cursor.setNext(lln);			
		}
		
		length++;
	}

	public LinkedListNode<T> delete(LinkedListNode<T> lln)
	{
		length--;			
		return lln;
	}

	public LinkedListNode<T> search(LinkedListNode<T> lln)
	{
		LinkedListNode<T> cursor = head;

		if(cursor != null)
		{
			while(cursor.getNext() != null)
			{
				if(cursor.compareTo(lln) == 0)
					return cursor;

				cursor = cursor.getNext();
			}
		}
		
		return null;
	}		

	public LinkedListNode<T> getHead()	
	{
		return head;
	}

}
