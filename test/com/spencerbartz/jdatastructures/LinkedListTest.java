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
		Dummy d1 = new Dummy("Lloyd Christmas", 38);		
		LinkedListNode<Dummy> node1 = new LinkedListNode<Dummy>(Dummy.class, d1);		

		Dummy d2 = new Dummy("Harry Dunne", 33);		
		LinkedListNode<Dummy> node2 = new LinkedListNode<Dummy>(Dummy.class, d2);		

		LinkedList<Dummy> list = new LinkedList<Dummy>();
		assertEquals(0, list.getLength());

		list.insert(node1);
		list.insert(node2);
		assertEquals(2, list.getLength());
		assertEquals(node1, list.getHead());
	}

	public void testToString()
	{
		Dummy d1 = new Dummy("Lloyd Christmas", 38);		
		LinkedListNode<Dummy> node1 = new LinkedListNode<Dummy>(Dummy.class, d1);

		Dummy d2 = new Dummy("Harry Dunne", 33);		
		LinkedListNode<Dummy> node2 = new LinkedListNode<Dummy>(Dummy.class, d2);		
		
		LinkedList<Dummy> list = new LinkedList<Dummy>();
		list.insert(node1);
		list.insert(node2);

		String dumb = "My name is Lloyd Christmas and I'm 38years old\n";
    String dumber = "My name is Harry Dunne and I'm 33years old\n";
		assertEquals(dumb + dumber, list.toString());
	}

	public void testDelete()
	{
		/*
		Dummy d1 = new Dummy("Lloyd Christmas", 38);		
		LinkedListNode<Dummy> node = new LinkedListNode<Dummy>(Dummy.class, d1);		
		LinkedList<Dummy> list = new LinkedList<Dummy>();
		list.delete(node);

		assertEquals(0,list.getLength());
	*/
	}
}

