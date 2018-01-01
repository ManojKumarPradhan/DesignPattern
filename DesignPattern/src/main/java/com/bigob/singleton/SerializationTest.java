package com.bigob.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {
		SingletonClass singletonClass=null, singletonClass2=null;
		ObjectOutputStream objectOutputStream=null;
		ObjectInputStream objectInputStream=null;
		
		singletonClass=SingletonClass.getInstance();
		
		System.out.println(singletonClass);
		try {
			objectOutputStream=new ObjectOutputStream(new FileOutputStream("E:/seriJAN.ser"));
			objectOutputStream.writeObject(singletonClass);
			objectOutputStream.flush();
			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			objectInputStream=new ObjectInputStream(new FileInputStream("E:/seriJAN.ser"));
			singletonClass2=(SingletonClass) objectInputStream.readObject();
			System.out.println(singletonClass2);
			objectInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
