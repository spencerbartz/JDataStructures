package com.spencerbartz.jdatastructures;

public class LinkedList<T extends Comparable<T>>
{
	private LinkedListNode<T> head;
	private int length;

	public LinkedList(LinkedListNode<T> lln)
	{
		head = lln;
		head.setNext(null);
		// This is not a doubly linked list but LinkedListNode.java has a prev...
		// Perhaps we should have a singlyLinkedListNode and a doubleLinkedListNode
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

	public LinkedListNode<T> delete(LinkedListNode<T> nodeToDelete)
	{
		// We're the last node
		if(nodeToDelete.getNext() == null)
		{
			nodeToDelete = null;
		}
		// We're the head node
		else if(nodeToDelete.compareTo(head) == 0)
		{
			LinkedListNode<T> temp = head.getNext();
			head = null;
			head = temp;
		}
		else
		{
			LinkedListNode<T> temp = nodeToDelete.getNext();
			nodeToDelete.setData(nodeToDelete.getNext().getData());
			nodeToDelete.setNext(temp.getNext());
			temp = null;
		}

		length--;
		return nodeToDelete;
	}

	public LinkedListNode<T> find(LinkedListNode<T> nodeToFind)
	{
		LinkedListNode<T> cursor = head;

		while(cursor != null)
		{
			if(cursor.compareTo(nodeToFind) == 0)
				return nodeToFind;
			cursor = cursor.getNext();
		}

		return null;
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

	public boolean contains(LinkedListNode<T> nodeToFind)
	{
		LinkedListNode<T> cursor = head;
		while(cursor != null)
		{
			if(cursor.compareTo(nodeToFind) == 0)
				return true;
		}
		return false;
	}
}
