package com.bigob.abstractfactory;

public class DAOFActoryCreater {

	public static DAOFactry createFactory(String factoryType){
		DAOFactry factory=null;
		if(factoryType=="DB"){
			factory=new DBDAOFactory();
		}
		if(factoryType=="Excel"){
			factory=new ExcelDAOFactory();
		}
		return factory;
	}
}
