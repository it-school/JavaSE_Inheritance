package com.itschool;

import java.util.Locale;

public class Rectangle
{
	public static final String FORMAT = "%.1f";
	private double width, length;

	public Rectangle(double width, double length)
	{
		this.setWidth(width);
		this.setLength(length);
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width)
	{
		this.width = width > 0 ? width : -1;
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		this.length = length > 0 ? length : -1;
	}

	@Override
	public String toString()
	{
		Locale.setDefault(Locale.US);
		return "Rectangle {" +
				"width=" + String.format(FORMAT, width) +
				", length=" + String.format(FORMAT, length) +
				", diagonal=" + String.format(FORMAT, getDiagonal()) +
				", perimeter=" + String.format(FORMAT, getPerimeter()) +
				", square=" + String.format(FORMAT, getArea()) +
				'}';
	}

	public double getDiagonal()
	{
		return Math.sqrt(width * width + length * length);
	}

	public double getPerimeter()
	{
		return (length + width) * 2;
	}

	public double getArea()
	{
		return this.length * this.width;
	}
}
