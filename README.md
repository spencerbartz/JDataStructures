# JDataStructures Library
JDataStructures is a library of home-grown data structures using Java Generics.
Generics did not exist when I took data structures in college. When Generics finally were
available I dabbled with them in some personal projects but did not go in depth.
Revisiting common data structures with Generics has been a fun way to review and learn.
The project is done in TDD style and is bare bones using only the Ant build tool.
Given that, to use this library you will need to be familiar with command line / terminal usage.

### Available Data Structure Classes
1. Stack
2. Singly Linked List

### Works in Progress
1. Binary Tree
2. N-Ary Tree
3. Dynamically sizing array (like the Vector class of yore)
4. Hash Table
5. Double Linked List
6. Performance Improvements to Stack

## Requirements:
1. JDK 1.8
2. Ant
3. JUnit

##### The following are known as "targets" in the Ant build system (excluding those
##### starting with "0." Those are just commands). For more information on targets,
##### take a look at build.xml or the [Ant documentation](http://ant.apache.org/)

## Cloning the project (Where $> is your command line prompt):
1. ```$> cd your/projects/directory/```
2. ```$> git clone https://github.com/spencerbartz/JDataStructures.git```

## To Build the project from the root directory using the command line:
0. ```$> cd JDataStructures/```
1. ```$> ant clean```
2. ```$> ant compile```
3. ```$> ant release```

### What each target does
0. Enter the JDataStructures directory
1. Remove all residual .class files and .jar files which may be out of date
2. Compile the Java code that makes up the JDataStructures library
3. Create .jar file for release

## Build the tests from the test root directory using the command line
0. ```$> cd JDataStructures/test```
1. ```$> ant clean```
2. ```$> ant build```
3. ```$> ant run```

### What each target does
0. Enter the JDataStructures/test directory
1. Remove all residual .class files which may be out of date
2. Compile the Java code that makes up the JDataStructures test suite
3. Run the tests and see the results!

# How to use the JDataStructures library when you compile / run your own code
## 1. Compile: ```javac -cp path/to/libs/jdatastructures.jar:. Example.java ```
## 2. Run: ```java -cp path/to/libs/jdatastructures.jar:. Example```

If you're compiling / running from the same directory as the jar, be sure to add ```-cp ./yourjar.jar:.``` to your classpath

# How to import the classes into your Java source
Here is an example file called Example.java that uses the Stack JDataStructure
```
import com.spencerbartz.jdatastructures;

public class Example
{
  public static void main(String args[])
  {
    Stack<Integer> stack = new Stack<Integer>(Integer.class, 5);
		stack.push(new Integer(10));
		Integer i = stack.pop();
    System.out.println("The Number is: " + i.toString());
  }
}
```
