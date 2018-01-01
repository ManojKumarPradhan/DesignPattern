package com.bigob.builder;

public class Kite {

	private String paper;
	private String thread;
	private String others;
	

	public Kite makeKite(Builder builder) {
		this.paper=builder.getPaper();
		this.thread=builder.getThread();
		this.others=builder.getOthers();
		return this;
	}


	@Override
	public String toString() {
		return "Kite made with "+paper+" paper color and with "+thread+" thread and uses "+others;
	}
	
}
