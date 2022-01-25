package com.lagm.test.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.lagm.SomeComplexClass;
import com.lagm.clases.DataBaseClass;
import com.lagm.clases.NetworkClass;
import com.lagm.clases.OutputClass;
import com.lagm.clases.hijas.DataBaseMock;
import com.lagm.clases.hijas.NetworkMock;
import com.lagm.clases.hijas.OutputMock;

public class SomeComplexClassTest {

	@Test
	public void test1() {
		DataBaseClass dataBaseClass = new DataBaseMock();
		NetworkClass networkClass = new NetworkMock();
		OutputClass outputClass = new OutputMock();
		SomeComplexClass someComplexClass = new SomeComplexClass(dataBaseClass, networkClass, outputClass);
		someComplexClass.concatStringsFromDataBaseAndNetworkAndOutputResult();
		
		
		OutputMock outputMock = (OutputMock)outputClass;
		String valorReal = outputMock.getTheString();
		String resultadoEsperado = "Hello - Hello2";
		System.out.println("valorReal: " + valorReal);
		assertEquals(valorReal, resultadoEsperado);
	}
}
