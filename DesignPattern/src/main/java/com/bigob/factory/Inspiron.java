package com.bigob.factory;

public class Inspiron implements Dell {

	@Override
	public Inspiron insertRAM(String ramSize) {
		System.out.println(ramSize + " inserted into Inspiron \n");
		return this;
	}

	@Override
	public Inspiron insertProcessor(String processor) {
		System.out.println(processor + " inserted into Inspiron \n");
		return this;
	}

	@Override
	public Inspiron defineColor(String color) {
		System.out.println(color + " painted into Inspiron");
		return this;
	}
}
