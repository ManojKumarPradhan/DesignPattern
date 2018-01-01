package com.bigob.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionAPITest {

	public static void main(String[] args) {
		SingletonClass singletonClass=null, singletonClass2=null;
		Constructor<?>[] constructor=null;
		
		singletonClass=SingletonClass.getInstance();
		System.out.println(singletonClass);
		try {
			Class<?> class1=Class.forName("com.bigob.singleton.SingletonClass");
			constructor=class1.getDeclaredConstructors();
			constructor[0].setAccessible(true);
			singletonClass2=(SingletonClass) constructor[0].newInstance(null);
			System.out.println(singletonClass2);
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
