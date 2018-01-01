package com.bigob.composite;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends School{

	private List<Student> liStudents=new ArrayList<>();
	
	private String specialsation;

	public Teacher(String name, int id, String specialsation) {
		super(name, id);
		this.specialsation=specialsation;
	}
	
	public void add(School school){
		liStudents.add((Student) school);
	}
	
	@Override
	public void remove(School school) {
		liStudents.remove((Student)school);
	}
	
	@Override
	public String toString() {
		StringBuilder builder=new StringBuilder();
		builder.append("ID: "+id);
		builder.append("Name: "+name);
		builder.append("Specialsation : "+specialsation);
		liStudents.forEach(student->{
			builder.append("\n\t\t");
			builder.append(student.toString());
		});
		return builder.toString();
	}
	
	
}
