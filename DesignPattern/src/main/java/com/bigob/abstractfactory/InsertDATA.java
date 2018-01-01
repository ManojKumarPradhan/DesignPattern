package com.bigob.abstractfactory;

public class InsertDATA {

	public static void main(String[] args) {
		InsertDAO stDAO = null, courseDAO = null;
		DAOFactry dbFactory = null;
		dbFactory = DAOFActoryCreater.createFactory(FactoryConst.DB_TYPE);
		stDAO = dbFactory.createDAO(FactoryConst.STUDENT_TYPE);
		stDAO.insert();
		courseDAO = dbFactory.createDAO(FactoryConst.COURSE_TYPE);
		courseDAO.insert();

		System.out.println("......................................................");

		dbFactory = DAOFActoryCreater.createFactory(FactoryConst.EXCLE_TYPE);
		stDAO = dbFactory.createDAO(FactoryConst.STUDENT_TYPE);
		stDAO.insert();
		courseDAO = dbFactory.createDAO(FactoryConst.COURSE_TYPE);
		courseDAO.insert();
	}
}
