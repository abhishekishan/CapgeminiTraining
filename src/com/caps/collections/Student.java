package com.caps.collections;
import java.io.Serializable;

public class Student implements Serializable
{
	int id;
	String name;
	
	public Student(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Student [ id= "+id+", name= "+name+" ]";
	}
}
