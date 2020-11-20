package com.itschool.task1;

public class ExcelentPupil extends Pupil
{
	public ExcelentPupil(String name)
	{
		super(name);
	}

	public ExcelentPupil(String name, Sex sex)
	{
		super(name, sex);
	}

	@Override
	public String study()
	{
		return super.study() + " excellent";
	}

	@Override
	public String relax()
	{
		return super.relax() + " so-so";
	}

	@Override
	public String toString()
	{
		return super.toString() + System.lineSeparator() + "I'm excellent";
	}
}
