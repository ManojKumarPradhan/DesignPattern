package com.bigob.abstractfactory;

public class StudentExcelDAO implements InsertDAO{

	@Override
	public void insert() {
		System.out.println("Student inserted in Excel");
	}

}

