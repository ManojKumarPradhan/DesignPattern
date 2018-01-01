package com.bigob.composite;

import java.util.ArrayList;
import java.util.List;

public class Principal extends School {

	private List<School> list = new ArrayList<>();

	public Principal(String name, int id) {
		super(name, id);
	}

	@Override
	public void add(School school) {
		list.add((Teacher) school);
	}

	@Override
	public void remove(School school) {
		list.remove((Teacher) school);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ID : " + id);
		builder.append("Name : " + name);
		builder.append("\n");
		list.forEach(teacher -> {
			builder.append("\n\t");
			builder.append(teacher.toString());
		});
		return builder.toString();
	}

}
