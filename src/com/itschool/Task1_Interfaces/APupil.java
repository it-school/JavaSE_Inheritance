package com.itschool.Task1_Interfaces;

import com.itschool.task1.Sex;

public abstract class APupil
{
	private String name;
	private Sex sex;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Sex getSex()
	{
		return sex;
	}

	public void setSex(Sex sex)
	{
		this.sex = sex;
	}

	public void gotoSchool(String time)
	{
		System.out.println("I come in " + time);
	}

	public abstract String study();

	public abstract String relax();

	public abstract String read();

	public abstract String write();

	public abstract String toString();
}
