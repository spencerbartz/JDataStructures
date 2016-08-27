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
		LinkedListNode<T> cursor = head;

		if(empty())
		{
				head = lln;
		}
		else
		{
			while(cursor.getNext() != null)
			{
				cursor = cursor.getNext();
			}

			cursor.setNext(lln);
		}
	
		length++;
	}

	public void delete(LinkedListNode<T> nodeToDelete)
	{
		LinkedListNode<T> temp = nodeToDelete.getNext();
		nodeToDelete.setData(nodeToDelete.getNext().getData());
		nodeToDelete.setNext(temp.getNext());

		length--;
	}

	public String toString()
	{
		StringBuffer sb = new StringBuffer();		

		if(empty())
		{
			return "";
		}
		else
		{
			LinkedListNode<T> cursor = head;

			while(cursor != null)
			{
				sb.append(cursor.getData().toString() + "\n");
				cursor = cursor.getNext();
			}
			return sb.toString();
		}
	}

	public LinkedListNode<T> getHead()	
	{
		return head;
		}

	public boolean empty()
	{
			return head == null;
	}
}
