package com.bigob.singleton;

public class SingletonMulti {

	public static void main(String[] args) {
		
		 new Thread(new BreakSingletonThread()).start();
		 
		 new Thread(new BreakSingletonThread()).start();
	}
}
