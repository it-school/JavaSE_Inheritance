package com.itschool.task2;

import java.util.Calendar;

public class Vehicle
{
	private String name;
	private double latitude;
	private double longitude;
	private int price;
	private int velocity;
	private int productionYear;
	private SpeedUnit speedunits;

	public Vehicle(String name, double latitude, double longitude, int price, int velocity, int productionYear)
	{
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.price = price;
		this.velocity = velocity;
		this.setProductionYear(productionYear);
		this.speedunits = SpeedUnit.kmPerHour;
	}

	public double getLatitude()
	{
		return latitude;
	}

	public void setLatitude(double latitude)
	{
		this.latitude = latitude;
	}

	public double getLongitude()
	{
		return longitude;
	}

	public void setLongitude(double longitude)
	{
		this.longitude = longitude;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public int getVelocity()
	{
		return velocity;
	}

	public void setVelocity(int velocity)
	{
		this.velocity = velocity;
	}

	public int getProductionYear()
	{
		return productionYear;
	}

	public void setProductionYear(int productionYear)
	{
		this.productionYear = productionYear > 1900 && productionYear < Calendar.getInstance().get(Calendar.YEAR) ? productionYear :
				Calendar.getInstance().get(Calendar.YEAR);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public SpeedUnit getSpeedunits()
	{
		return speedunits;
	}

	public void setSpeedunits(SpeedUnit speedunits)
	{
		this.speedunits = speedunits;
	}

	@Override
	public String toString()
	{
		return this.getClass().getSimpleName() +
				" " + name +
				"\nlat: " + latitude +
				", lon: " + longitude +
				", price: " + price +
				", velocity: " + velocity + " (" + speedunits + ")" +
				", produced in " + productionYear;
	}
}
