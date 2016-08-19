package com.spencerbartz.jdatastructures;

import java.util.Arrays;

import junit.framework.TestCase;

public class NodeTest extends TestCase 
{
	public void testConstructor()
	{
		String s = "Some data";
		Node<String> n = new Node<String>(String.class, s);
		
		assertEquals(s, n.getData());
	}
}

