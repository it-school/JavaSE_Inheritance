package com.itschool.task1;

public class BadPupil extends Pupil
{
	public BadPupil(String name)
	{
		super(name);
	}

	public BadPupil(String name, Sex sex)
	{
		super(name, sex);
	}

	@Override
	public String study()
	{
		return super.study() + " bad";
	}

	@Override
	public String relax()
	{
		return super.relax() + " excellent";
	}

	@Override
	public String toString()
	{
		return super.toString() + System.lineSeparator() + "I'm bad pupil";
	}

}
