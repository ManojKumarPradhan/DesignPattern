package com.bigob.factory;

public class DellFactory {

	public static void main(String[] args) {
		DellManu.createDell(DellType.INPIRON);
		System.out.println("..........................................................");
		DellManu.createDell(DellType.VOSTRO);
		
	}
}
