package com.itschool.Task1_Interfaces;

import com.itschool.task1.Sex;

public class ExcellentPupil extends APupil
{
	public ExcellentPupil(String name, Sex sex)
	{
		this.setName(name);
		this.setSex(sex);
	}

	@Override
	public String study()
	{
		return "Studies excellent";
	}

	@Override
	public String relax()
	{
		return "Relaxes bad";
	}

	@Override
	public String read()
	{
		return "Reads much";
	}

	@Override
	public String write()
	{
		return "Writes correct";
	}

	@Override
	public String toString()
	{
		return "Excellent pupil, " + getName() + " (" + getSex() + ")" +
				System.lineSeparator() + study() +
				System.lineSeparator() + read() +
				System.lineSeparator() + write() +
				System.lineSeparator() + relax();
	}


}
