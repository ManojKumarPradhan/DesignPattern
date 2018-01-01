package com.bigob.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingletonClass extends CommonInterface {

	/**
	 * This is because if we send the data through serialization then it may be or may not be the the 
	 * same system or same OS so it is good to generate serialVersionUID
	 */
	private static final long serialVersionUID = -3488209126190051707L;
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
