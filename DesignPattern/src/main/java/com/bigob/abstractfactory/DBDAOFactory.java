package com.bigob.abstractfactory;

public class DBDAOFactory implements DAOFactry{

	@Override
	public InsertDAO createDAO(String daoType) {
		InsertDAO dao=null;
		if(daoType.equalsIgnoreCase("student")){
			dao=new StudentDBDAO();
		}
		else if(daoType.equalsIgnoreCase("course")){
			dao=new CourseDBDAO();
		}
		else{
		  throw new IllegalArgumentException("invalid type");	
		}
		return dao; 
	}
}
