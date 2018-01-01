package com.bigob.factory;

public class Vostro implements Dell {

	@Override
	public Vostro insertRAM(String ramSize) {
		System.out.println(ramSize + " inserted into Vostro \n");
		return this;
	}

	@Override
	public Vostro insertProcessor(String processor) {
		System.out.println(processor + " inserted into Vostro \n");
		return this;
	}

	@Override
	public Vostro defineColor(String color) {
		System.out.println(color + " painted into Vostro");
		return this;
	}

}
