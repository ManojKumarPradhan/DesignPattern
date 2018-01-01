package com.bigob.strategy;

public class Veichle {

	private Engine engine;
	public void setEngine(Engine engine){
		this.engine=engine;
	}
	
	public void move(){
		engine.run();
		System.out.println("Vechile started.......");
	}
	
	public void stop(){
		engine.stop();
		System.out.println("Vechile stopped ");
	}
}
