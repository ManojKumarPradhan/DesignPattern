package com.bigob.abstractfactory;

public interface DAOFactry{
	public InsertDAO createDAO(String daoType);
}
