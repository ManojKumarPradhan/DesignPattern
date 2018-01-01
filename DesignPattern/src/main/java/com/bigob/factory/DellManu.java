package com.bigob.factory;

public class DellManu {

	public static void  createDell(DellType type) {
		Dell dell = null;
		if (type == DellType.INPIRON) {
			dell = new Inspiron();
		}
		if (type == DellType.VOSTRO) {
			dell = new Vostro();
		}
		dell.insertRAM("4GB").insertProcessor("High Processor").defineColor("RED");
	}
}
