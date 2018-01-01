package com.bigob.strategy;

public class PetrolVeichle implements Engine{

	@Override
	public void run() {
		System.out.println("Petrol Veichle grearing up....");
	}

	@Override
	public void stop() {
		System.out.println("Petrol Veichle breaking now....");
	}

}
