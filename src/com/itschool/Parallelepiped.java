package com.itschool;

public class Parallelepiped extends Rectangle
{
	private double height;

	public Parallelepiped(double width, double length, double height)
	{
		super(width, length);
		this.setHeight(height);
	}

	@Override
	public double getArea()
	{
		return super.getArea() * 4 + this.getLength() * this.getHeight() * 2;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height > 0 ? height : -1;
	}

	@Override
	public double getPerimeter()
	{
		return super.getPerimeter() * 2 + 4 * this.getHeight();
	}

	@Override
	public String toString()
	{
		String result = super.toString();
		result = this.getClass().getSimpleName() + result.substring(this.getClass().getSuperclass().getSimpleName().length());
		int insertPosition = result.indexOf(',', result.indexOf(',') + 1);

		result = result.substring(0, insertPosition) + ", heigth=" + this.getHeight()
				+ ", volume=" + this.getVolume()
				+ result.substring(insertPosition);

		return result;
	}

	public double getVolume()
	{
		return super.getArea() * this.getHeight();
	}
}
