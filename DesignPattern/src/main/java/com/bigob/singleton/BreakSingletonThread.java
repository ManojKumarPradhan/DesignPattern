package com.bigob.singleton;

public class BreakSingletonThread implements Runnable {

	@Override
	public void run() {
		SingletonClass object1 = null;
		object1 = SingletonClass.getInstance();
		System.out.println(object1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
