package com.bigob.builder;

public class BuilderTest {

	public static void main(String[] args) {
		Builder builder=new Builder()
				.setPaper("Red")
				.setThread("100Mtr")
				.setOthers("Other Required");
		Kite kite=builder.buildKite(builder);
		System.out.println(kite.toString());
		
	}
}
