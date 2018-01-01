package com.bigob.singleton;

public class SerializableCloneTest {

	public static void main(String[] args) {
		SingletonClass singletonClass=null,singletonClass2=null;
		
		singletonClass=SingletonClass.getInstance();
		System.out.println(singletonClass);
		
		try {
			singletonClass2=(SingletonClass) singletonClass.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(singletonClass2);
	}
}
