package com.spencerbartz.jdatastructures;

import java.util.Arrays;
import junit.framework.TestCase;

import com.spencerbartz.jdatastructures.*;

public class LinkedListNodeTest extends TestCase 
{
	public void testConstructor()
	{
		LinkedListNode<String> justANode = new LinkedListNode<String>(String.class, "I'm just a node, in the world");
		assertEquals("I'm just a node, in the world", justANode.toString());
	}

	public void testAccessors()
	{
		LinkedListNode<String> middle = new LinkedListNode<String>(String.class, "I am the middle node");
		LinkedListNode<String> next = new LinkedListNode<String>(String.class, "I am the next node");		
		LinkedListNode<String> prev = new LinkedListNode<String>(String.class, "I am the previous node");				

		middle.setNext(next);
		middle.setPrev(prev);

		assertEquals(next, middle.getNext());	
		assertEquals(prev, middle.getPrev());
	}

	public void testCompareTo()
	{
		LinkedListNode<String> node1 = new LinkedListNode<String>(String.class, "I am the the first node");
		LinkedListNode<String> node2 = new LinkedListNode<String>(String.class, "I am the the first node");
		assertEquals(0, node1.compareTo(node2));
	}

	public void testDataTypes()
	{
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);

		LinkedListNode<Integer> node1 = new LinkedListNode<Integer>(Integer.class, i1);
		LinkedListNode<Integer> node2 = new LinkedListNode<Integer>(Integer.class, i2);

		assertTrue(node1.compareTo(node1) == 0);
		assertTrue(node1.compareTo(node2) != 0); 
		assertEquals(10, node1.getData().intValue());
	}

	public void testUserDefined()
	{
		Dummy d = new Dummy("Lloyd Christmas", 38);
		LinkedListNode<Dummy> node = new LinkedListNode<Dummy>(Dummy.class, d);
		assertEquals(38, node.getData().getAge());
		assertEquals("Lloyd Christmas", node.getData().getName());

		node.getData().setName("Harry Dunne");
		node.getData().setAge(35);

		assertEquals(35, node.getData().getAge());
		assertEquals("Harry Dunne", node.getData().getName());
	}
}

