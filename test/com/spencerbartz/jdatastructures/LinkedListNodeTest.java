package com.spencerbartz.jdatastructures;

import java.util.Arrays;
import junit.framework.TestCase;

import com.spencerbartz.jdatastructures.Dummy;

public class LinkedListNodeTest extends TestCase 
{
	public void testConstructor()
	{
		LinkedListNode<String> justANode = new LinkedListNode<String>(String.class, "I'm just a node, in the world");
		assertEquals("I'm just a node, in the world", justANode.getData());
	}

	public void testAccessors()
	{
		LinkedListNode<String> middle = new LinkedListNode<String>(String.class, "I am the middle node");
		LinkedListNode<String> next = new LinkedListNode<String>(String.class, "I am the next	 node");		
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

	public void testCompareToWithUserDefinedType()
	{
		Dummy dee = new Dummy("Tweedle-Dee", 12);
		Dummy dum = new Dummy("Tweedle-Dum", 12);		
		LinkedListNode<Dummy> node1 = new LinkedListNode<Dummy>(Dummy.class, dee);
		LinkedListNode<Dummy> node2 = new LinkedListNode<Dummy>(Dummy.class, dum);

		assertEquals(-1, node1.compareTo(node2));

		Dummy dumber = new Dummy("Lloyd Christmas", 37);
		dumber.setName("Tweedle-Dee");
		dumber.setAge(12);
		LinkedListNode<Dummy> node3 = new LinkedListNode<Dummy>(Dummy.class, dumber);
		
		assertEquals(0, node1.compareTo(node3));
	}	
}

