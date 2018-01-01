package com.bigob.strategy;

public class DesileVeichle implements Engine{

	@Override
	public void run() {
		System.out.println("Desile Veichle grearing up....");
	}

	@Override
	public void stop() {
		System.out.println("Desile Veichle breaking now....");
	}

}
