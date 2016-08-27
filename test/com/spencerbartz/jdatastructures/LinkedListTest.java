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

		String dumb = "My name is Lloyd Christmas and I'm 38 years old\n";
    String dumber = "My name is Harry Dunne and I'm 33 years old\n";
		assertEquals(dumb + dumber, list.toString());
	}

	public void testDelete()
	{
		Dummy d1 = new Dummy("Moe", 138);		
		LinkedListNode<Dummy> node1 = new LinkedListNode<Dummy>(Dummy.class, d1);
		Dummy d2 = new Dummy("Larry", 133);		
		LinkedListNode<Dummy> node2 = new LinkedListNode<Dummy>(Dummy.class, d2);		
		Dummy d3 = new Dummy("Curly", 123);		
		LinkedListNode<Dummy> node3 = new LinkedListNode<Dummy>(Dummy.class, d3);		
		Dummy d4 = new Dummy("Shemp", 140);		
		LinkedListNode<Dummy> node4 = new LinkedListNode<Dummy>(Dummy.class, d4);		

		LinkedList<Dummy> list = new LinkedList<Dummy>();
		list.insert(node1);
		list.insert(node2);
		list.insert(node3);

		node1 = list.delete(node1);		
		node2 = list.delete(node2);
		
	  String stooge1 = "My name is Curly and I'm 123 years old\n";
		assertEquals(stooge1, list.toString());
		assertEquals(1, list.getLength());

		list.insert(node4);	
		assertEquals(2, list.getLength());
		
		String stooge2 = "My name is Shemp and I'm 140 years old\n";
		assertEquals(stooge1 + stooge2, list.toString());
	}

	public void testFind()
	{
		Dummy d1 = new Dummy("Moe", 138);		
		LinkedListNode<Dummy> node1 = new LinkedListNode<Dummy>(Dummy.class, d1);
		Dummy d2 = new Dummy("Larry", 133);		
		LinkedListNode<Dummy> node2 = new LinkedListNode<Dummy>(Dummy.class, d2);		
		Dummy d3 = new Dummy("Curly", 123);		
		LinkedListNode<Dummy> node3 = new LinkedListNode<Dummy>(Dummy.class, d3);		
		Dummy d4 = new Dummy("Shemp", 140);		
		LinkedListNode<Dummy> node4 = new LinkedListNode<Dummy>(Dummy.class, d4);		

		LinkedList<Dummy> list = new LinkedList<Dummy>();
		list.insert(node1);
		list.insert(node2);
		list.insert(node3);

		assertEquals(null, list.find(node4));
		assertEquals("Curly", list.find(node3).getData().getName());
	}

	public void testContains(LinkedListNode<Dummy> nodeToFind)
	{
		Dummy d1 = new Dummy("Moe", 138);		
		LinkedListNode<Dummy> node1 = new LinkedListNode<Dummy>(Dummy.class, d1);
		Dummy d2 = new Dummy("Larry", 133);		
		LinkedListNode<Dummy> node2 = new LinkedListNode<Dummy>(Dummy.class, d2);		

		LinkedList<Dummy> list = new LinkedList<Dummy>();
		list.insert(node1);

		assertTrue(list.contains(node1));
		assertFalse(list.contains(node2));
	}
}

