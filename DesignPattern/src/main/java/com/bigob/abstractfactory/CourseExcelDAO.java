package com.bigob.abstractfactory;

public class CourseExcelDAO implements InsertDAO{

	@Override
	public void insert() {
		System.out.println("Course Inserted in Excel");
	}

}
