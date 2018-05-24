package com.spencerbartz.jdatastructures;

import java.lang.reflect.Array;

// Array based stack. Not very efficient.
public class Stack<T extends Comparable<?>>
{
  private T ary[];
  private Class<?> klasse;
  private int capacity;
  private int size = 0;

  public Stack(Class<?> klasse, int capacity)
  {
		final T[] ary = (T[]) Array.newInstance(klasse, capacity);
		this.ary = ary;
		this.klasse = klasse;
    this.capacity = capacity;
  }

  public void push(T t)
  {
    T tempAry[] = (T[]) Array.newInstance(klasse, capacity + 1);

    for(int i = 1; i < ary.length; i++)
        tempAry[i] = ary[i];

        tempAry[0] = t;
        ary = tempAry;
    size++;
  }

  public T pop()
  {
    T returnValue = ary[0];
    T tempAry[] = (T[]) Array.newInstance(klasse, capacity);
    for(int i = 0; i < ary.length - 1; i++)
      tempAry[i] = ary[i + 1];
    ary = tempAry;
    size--;

    return returnValue;
  }

  public T peek()
  {
    return ary[0];
  }

  public int size()
  {
    return size;
  }

  public int capacity()
  {
    return capacity;
  }
}
