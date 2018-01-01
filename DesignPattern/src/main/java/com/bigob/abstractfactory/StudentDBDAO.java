package com.bigob.abstractfactory;

public class StudentDBDAO implements InsertDAO{

	@Override
	public void insert() {
		System.out.println("Student inserted in DB");
	}

}
