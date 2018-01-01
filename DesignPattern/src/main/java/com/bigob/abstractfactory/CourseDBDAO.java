package com.bigob.abstractfactory;

public class CourseDBDAO implements InsertDAO{

	@Override
	public void insert() {
		System.out.println("Course Inserted into DB");
	}

}
