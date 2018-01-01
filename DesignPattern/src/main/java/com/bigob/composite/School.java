package com.bigob.composite;

public abstract class School {

	protected String name;
	protected int id;
	public School(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public abstract String toString();
	
	public void add(School school){}
	
	public void remove(School school){}
	
}
