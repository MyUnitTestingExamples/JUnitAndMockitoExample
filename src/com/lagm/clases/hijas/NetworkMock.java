package com.lagm.clases.hijas;

import java.io.IOException;

import com.lagm.clases.NetworkClass;

public class NetworkMock extends NetworkClass {
	@Override
	public String getStringFromRemoteServer() throws IOException {
		return "World";
	}
}
