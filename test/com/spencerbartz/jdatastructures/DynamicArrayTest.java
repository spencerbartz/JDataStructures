package com.spencerbartz.jdatastructures;

import java.util.Arrays;

import junit.framework.TestCase;

public class DynamicArrayTest extends TestCase
{
	public void testConstructor()
	{
		DynamicArray<String> da = new DynamicArray<String>(String.class, 5);
		assertEquals(0, da.getSize());
		assertEquals(5, da.getCapacity());
	}

	public void testInsert()
	{
		DynamicArray<String> da = new DynamicArray<String>(String.class, 5);
		assertEquals(0, da.getSize());		
		da.insert("one");
		da.insert("two");
		da.insert("three");
		da.insert("four");
		da.insert("five");
		da.insert("six");

		assertEquals(6, da.getSize());
		assertEquals(10, da.getCapacity());
	}

	public void testDelete()
	{
		DynamicArray<String> da = new DynamicArray<String>(String.class, 5);
		da.insert("one");
		da.insert("two");
		da.insert("three");

		assertTrue(da.delete("one"));
		assertFalse(da.delete("not in array"));		
	}

	public void testToArray()
	{
		DynamicArray<String> da = new DynamicArray<String>(String.class, 5);
		String strings[] = {"This", "is", "a", "test"};

		da.insert("This");
		da.insert("is");
		da.insert("not");
		da.insert("a");
		da.insert("test");
		da.delete("not");
		
		assertTrue(Arrays.equals(strings, da.toArray()));
	}
}

