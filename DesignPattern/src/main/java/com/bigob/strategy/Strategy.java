package com.bigob.strategy;

public class Strategy {

	public static void main(String[] args) {
		Veichle veichle=VechileFactory.getInstance("petrol");
		veichle.move();
		veichle.stop();
		
		Veichle veichle1=VechileFactory.getInstance("desile");
		veichle1.move();
		veichle1.stop();
	}
}
