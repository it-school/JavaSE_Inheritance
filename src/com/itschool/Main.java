package com.itschool;

import com.itschool.task1.*;
import com.itschool.task2.*;

public class Main
{
	public static void main(String[] args)
	{
		task1();
		task2();
		task3();
	}

	private static void task1()
	{
		Pupil pupil = new Pupil("Andrew");
		System.out.println(pupil);

		ExcelentPupil excelentPupil = new ExcelentPupil("John");
		System.out.println(excelentPupil);

		BadPupil badPupil = new BadPupil("Billy");
		System.out.println(badPupil);

		badPupil.setSex(Sex.male);

		ClassRoom classRoom = new ClassRoom(5);
		classRoom.pupils[0] = excelentPupil;
		classRoom.pupils[1] = badPupil;
		classRoom.pupils[2] = new BadPupil("Kate", Sex.female);
		classRoom.pupils[4] = new BadPupil("Freddy", Sex.female);

		int n = 1;
		for (Pupil pupil1 : classRoom.pupils) {
			System.out.println(n++ + ") " + System.lineSeparator() + pupil1 + System.lineSeparator());
		}
	}

	private static void task2()
	{
		Vehicle vehicle = new Vehicle("Беда", 42, 38, 100000, 12, 2010);
		System.out.println(vehicle);

		Car car = new Car("BMW", 30, 80, 20000, 140, 2021, 2000, CarType.sedan);
		System.out.println(car);
	}

	private static void task3()
	{

	}
}