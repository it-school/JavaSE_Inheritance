package com.itschool.Task1_Interfaces;

import com.itschool.task1.Sex;

public class BadPupil extends APupil
{
	public BadPupil(String name, Sex sex)
	{
		this.setName(name);
		this.setSex(sex);
	}

	@Override
	public String study()
	{
		return "Studies bad";
	}

	@Override
	public String relax()
	{
		return "Relaxes good";
	}

	@Override
	public String read()
	{
		return "Reads litle";
	}

	@Override
	public String write()
	{
		return "Writes incorrect";
	}

	@Override
	public String toString()
	{
		return "Bad pupil, " + getName() + " (" + getSex() + ")" +
				System.lineSeparator() + study() +
				System.lineSeparator() + read() +
				System.lineSeparator() + write() +
				System.lineSeparator() + relax();
	}


}
