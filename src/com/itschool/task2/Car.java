package com.itschool.task2;

public class Car extends Vehicle
{
	int weighting;
	CarType type;

	public Car(String name, double latitude, double longitude, int price, int velocity, int productionYear)
	{
		super(name, latitude, longitude, price, velocity, productionYear);
		this.setSpeedunits(SpeedUnit.milesPerHour);
	}

	public Car(String name, double latitude, double longitude, int price, int velocity, int productionYear, int weighting, CarType type)
	{
		super(name, latitude, longitude, price, velocity, productionYear);
		this.weighting = weighting;
		this.type = type;
		this.setSpeedunits(SpeedUnit.milesPerHour);
	}

	@Override
	public String toString()
	{
		return super.toString() +
				", weighting=" + weighting +
				", type: " + type;
	}
}
