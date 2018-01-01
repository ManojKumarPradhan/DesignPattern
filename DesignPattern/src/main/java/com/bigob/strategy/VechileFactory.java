package com.bigob.strategy;

public class VechileFactory {

	public static Veichle getInstance(String engineType){
		Veichle veichle=null;
		Engine engine=null;
		veichle=new Veichle();
		if(engineType.equalsIgnoreCase("desile")){
			engine=new DesileVeichle();
			veichle.setEngine(engine);
		}else if(engineType.equalsIgnoreCase("petrol")){
			engine=new PetrolVeichle();
			veichle.setEngine(engine);
		}else{
			throw new RuntimeException("Please provide correct information");
		}
		return veichle;
	}
	
}
