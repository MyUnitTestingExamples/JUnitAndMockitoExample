package com.lagm.clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class NetworkClass {
	public String getStringFromRemoteServer() throws IOException {
		Socket socket = new Socket("123.23.45.67", 33);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		final String line = bufferedReader.readLine();
		socket.close();
		return line;
	}
}
