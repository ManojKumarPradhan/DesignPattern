package com.bigob.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingletonClass {

	private static SingletonClass singletonClass = null;

	private SingletonClass() {

	}

	// this is create a loop hole to multi threading
	/*
	 * public static SingletonClass getInstance(){ if(singletonClass==null)
	 * singletonClass=new SingletonClass(); return singletonClass; }
	 */

	public static SingletonClass getInstance() {
		Lock lock = new ReentrantLock();
		if (singletonClass == null) {
			lock.lock();
			if (singletonClass == null) {
				singletonClass = new SingletonClass();
			}
			lock.unlock();
		}
		return singletonClass;
	}
}
