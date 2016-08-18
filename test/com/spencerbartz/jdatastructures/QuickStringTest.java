package com.spencerbartz.jdatastructures;

import java.util.Arrays;

import junit.framework.TestCase;

public class QuickStringTest extends TestCase 
{
	public void testConstructor()
	{
		QuickString qs = new QuickString();
		assertEquals("", qs.toString());

		qs = new QuickString(10);
		qs.append("Hey ");
		qs.append("Buddy");

		assertEquals("Hey Buddy", qs.toString());
	}

	public void testAppend()
	{
		QuickString qs = new QuickString();
		qs.append("This ");
		qs.append("is ");
		qs.append("just ");
		qs.append("a ");
		qs.append("unit ");
		qs.append("test");

		assertEquals("This is just a unit test", qs.toString());
	}

	public void testDelete()
	{
		QuickString qs = new QuickString();
		qs.append("This ");
		qs.append("is ");
		qs.append("not ");
		qs.append("just ");
		qs.append("a ");
		qs.append("unit ");
		qs.append("test");

		assertTrue(qs.delete("not "));
		assertFalse(qs.delete("I should return false"));

		assertEquals("This is just a unit test", qs.toString());
	}

	public void testDeleteAll()
	{
		QuickString qs = new QuickString();
		qs.append("Acme");
		qs.append(" little");
		qs.append(" giant");
		qs.append(" vacuum");
		qs.append(" vacuum");
		qs.append(" vacuum");
		qs.append(" toaster");
		qs.append(" company");
		qs.deleteAll(" vacuum");
		assertEquals("Acme little giant toaster company", qs.toString());

		qs.deleteAll(" TOASTER");
		assertEquals("Acme little giant toaster company", qs.toString());			
	}

	public void testToString()
	{
		QuickString qs = new QuickString();
		qs.append("Acme");
		qs.append(" little");
		qs.append(" giant ");
		qs.append("vacuum");
		qs.append(" vacuum");
		qs.append(" vacuum");
		qs.append(" company");
		qs.deleteAll(" vacuum");

		assertEquals("Acme little giant vacuum company", qs.toString());

		qs.delete(" company");
		qs.append(" corporation");

		assertEquals("Acme little giant vacuum corporation", qs.toString());
	}
}

