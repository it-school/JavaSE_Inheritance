package com.itschool.task1;


public class Pupil
{
	private String name;
	private Sex sex;

	public Pupil(String name)
	{
		this.setName(name);
		this.sex = Sex.n_a;
	}

	public Pupil(String name, Sex sex)
	{
		this.setName(name);
		this.sex = sex;
	}

	public Pupil()
	{
		name = "Anonymous";
	}

	public Sex getSex()
	{
		return sex;
	}

	public void setSex(Sex sex)
	{
		this.sex = sex;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	}

	@Override
	public String toString()
	{
		return this != null ?
				"My name is " + name + System.lineSeparator() + study() + System.lineSeparator() + relax() + System.lineSeparator() +
						(this.sex == Sex.male ? "I'm a boy" : (this.sex == Sex.female ? "I'm a girl" : "Sex not available"))
				: "Unknown pupil"
				;
	}

	public String study()
	{
		return "I study";
	}

	public String relax()
	{
		return "I relax";
	}


}
