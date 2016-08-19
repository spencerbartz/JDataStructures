package com.spencerbartz.jdatastructures;

import java.util.Arrays;

import junit.framework.TestCase;

public class HashTableTest extends TestCase 
{
	public void testConstructor()
	{
		HashTable<String> ht = new HashTable<String>(String.class);
		assertEquals(0, ht.getCount());
	}

	public void testInsert()
	{
		HashTable<String> ht = new HashTable<String>(String.class);
		ht.insert("Hey Buddy");
		assertEqual("Hey Buddy", ht.get(ht.hash("Hey Buddy")));
	}

	public void testDelete()
	{
		assertTrue(true);
	}
}

