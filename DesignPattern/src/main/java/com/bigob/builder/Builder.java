package com.bigob.builder;

public class Builder {

	private String paper;
	private String thread;
	private String others;
	public String getPaper() {
		return paper;
	}
	public Kite buildKite(Builder builder){
		return new Kite().makeKite(builder);
	}
	public Builder setPaper(String paper) {
		this.paper = paper;
		return this;
	}
	public String getThread() {
		return thread;
	}
	public Builder setThread(String thread) {
		this.thread = thread;
		return this;
	}
	public String getOthers() {
		return others;
	}
	public Builder setOthers(String others) {
		this.others = others;
		return this;
	}
	
	
}
