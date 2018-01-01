package com.bigob.singleton;

import java.io.Serializable;

public class CommonInterface implements Serializable,Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
