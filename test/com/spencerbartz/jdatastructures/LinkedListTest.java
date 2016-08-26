package com.spencerbartz.jdatastructures;

import junit.framework.TestCase;
import org.junit.*;

public class LinkedListTest extends TestCase
{
	public void testConstructor()
	{
		LinkedList<String> list1 = new LinkedList<String>();
		assertEquals(0, list1.getLength());

		LinkedList<String> list2 = new LinkedList<String>(new LinkedListNode<String>(String.class, "that was wordy!"));
		assertEquals(1, list2.getLength());
	}

	public void testInsert()
	{
		Dummy dee = new Dummy("Tweedle-Dee", 12);
		LinkedListNode<Dummy> node = new LinkedListNode<Dummy>(Dummy.class, dee);	
		LinkedList<Dummy> list = new LinkedList<Dummy>();
		assertEquals(0, list.getLength());

		list.insert(node);
		list.insert(node);
		assertEquals(2, list.getLength());
	}

	public void testSearch()
	{
		Dummy dumNode = new Dummy("Tweedle-Dum", 13);
		LinkedListNode<Dummy> dumNode = new LinkedListNode<Dummy>(Dummy.class, dumNode);	
		
		Dummy deeNode = new Dummy("Tweedle-Dee", 12);
		LinkedListNode<Dummy> node = new LinkedListNode<Dummy>(Dummy.class, dee);	

		LinkedList<Dummy> list = new LinkedList<Dummy>();	
	}
}

