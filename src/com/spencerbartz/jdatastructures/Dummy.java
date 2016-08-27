package com.spencerbartz.jdatastructures;

public class Dummy implements Comparable<Dummy>
{
	public String name;
	public int age;

	public Dummy() 
	{
		this.name = "Justin Bieber";
		this.age = 22;
	}

	public Dummy(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public void setName(String name)
	{	
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public int compareTo(Dummy d)
	{
		if(name.equals(d.getName()) && age == d.getAge())
			return 0;
		else 
			return -1;
	}

	public String toString()
	{
		return "My name is " + name + " and I'm " + age + "years old";
	}
}
