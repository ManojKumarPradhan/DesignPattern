package com.bigob.composite;

public class Student extends School {

	private String batch;
	
	public Student(String name, int id, String batch) {
		super(name, id);
		this.batch=batch;
	}

	@Override
	public String toString() {
		return "ID : "+id+", Name : "+name+", Batch : "+batch +"\n";
	}

}
