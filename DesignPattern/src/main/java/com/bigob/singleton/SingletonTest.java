package com.bigob.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		SingletonClass object1=null,object2=null;
		object1=SingletonClass.getInstance();
		object2=SingletonClass.getInstance();
		System.out.println(object1);
		System.out.println(object2);
	}
}
