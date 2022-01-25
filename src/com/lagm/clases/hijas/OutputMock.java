package com.lagm.clases.hijas;

import com.lagm.clases.OutputClass;

public class OutputMock extends OutputClass {
	private String theString;

	public String getTheString() {
		return this.theString;
	}

	public void printOutput(String theString) {
		this.theString = theString;
	}
}
