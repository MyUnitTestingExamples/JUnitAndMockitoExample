package com.lagm.clases.hijas;

import com.lagm.clases.DataBaseClass;

public class DataBaseMock extends DataBaseClass {
	@Override
	public String getStringFromDataBase() {
		return "Hello";
	}
}
