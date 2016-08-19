# JDataStructures Library
JDataStructures is a library of home-grown data structures using Java Generics.
Generics did not exist when I took data structures in college. When Generics finally were 
available I dabbled with them in some personal projects but did not go in depth.
Revisiting common data structures with Generics has been a fun way to review and learn.

# Requirements
1. JDK
2. Ant
3. JUnit

# Command line usage (Ant targets)
1. ant compile
2. ant release
3. ant test
4. ant clean

# What each target does
1. Compile JDataStructures code
2. Create .jar file for release
3. Compile JUnit tests
4. Remove build directories

# How to use the JDataStructures library when you compile / run
Compile:
```javac -cp path/to/libs/jdatastructures.jar:. Example.java```

Run:
```java -cp path/to/libs/jdatastructures.jar:. Example```

# How to import the classes into your Java source
Here is an example file called Example.java that uses the QuickString utility
```
import com.spencerbartz.jdatastructures.*;

public class Example
{
  public static void main(String args[])
  {
    QuickString qs = new QuickString();
    qs.append("Hello ");
    qs.append("World");
    System.out.println(qs.toString());
  }
}
```
