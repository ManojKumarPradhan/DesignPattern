package com.bigob.abstractfactory;

public class ExcelDAOFactory implements DAOFactry{

	@Override
	public InsertDAO createDAO(String daoType) {
		InsertDAO dao=null;
		if(daoType.equalsIgnoreCase("student")){
			dao=new StudentExcelDAO();
		}
		else if(daoType.equalsIgnoreCase("course")){
			dao=new CourseExcelDAO();
		}
		else{
		  throw new IllegalArgumentException("invalid type");	
		}
		return dao;
	}

}
