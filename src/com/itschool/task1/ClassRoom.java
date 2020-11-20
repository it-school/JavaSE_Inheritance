package com.itschool.task1;

public class ClassRoom
{
	public Pupil[] pupils;

	public ClassRoom(int pupilsNumber)
	{
		pupils = new Pupil[pupilsNumber];

		for (int i = 0; i < pupilsNumber; i++) {
			pupils[i] = new Pupil();
		}
	}
}
