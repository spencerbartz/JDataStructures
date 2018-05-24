package com.spencerbartz.jdatastructures;

import junit.framework.TestCase;
import org.junit.*;

public class StackTest extends TestCase
{
	public void testConstructor()
	{
		Stack<String> emptyStack = new Stack<String>(String.class, 10);
		assertEquals(10, emptyStack.capacity());

		Stack<Integer> nonEmptyStack = new Stack<Integer>(Integer.class, 5);
		assertEquals(5, nonEmptyStack.capacity());
	}

	public void testPush()
	{
    Stack<String> stack = new Stack<String>(String.class, 5);
    stack.push("Test String");
    assertEquals(1, stack.size());
	}

	public void testPeek()
	{
		Stack<String> stack = new Stack<String>(String.class, 5);
		stack.push("Another Test String");
		assertEquals(1, stack.size());
		assertEquals("Another Test String", stack.peek());
		assertEquals(1, stack.size());
	}

	public void testPop()
	{
		Stack<Integer> stack = new Stack<Integer>(Integer.class, 5);
		assertEquals(0, stack.size());
		stack.push(new Integer(10));
		Integer i = stack.pop();
		assertEquals(i.toString(), "10");
	}
}
