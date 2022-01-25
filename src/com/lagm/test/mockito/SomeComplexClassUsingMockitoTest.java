package com.lagm.test.mockito;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.lagm.SomeComplexClass;
import com.lagm.clases.DataBaseClass;
import com.lagm.clases.NetworkClass;
import com.lagm.clases.OutputClass;

@RunWith(MockitoJUnitRunner.class) // Mockito entra en acción para este test
public class SomeComplexClassUsingMockitoTest {
	@InjectMocks // Clase que deseamos testear
	SomeComplexClass someComplexClass;

	@Mock
	DataBaseClass dataBaseClass;

	@Mock
	NetworkClass networkClass;

	@Mock
	OutputClass outputClass;

	@Test
	public void someSimpleTest() throws SQLException, ClassNotFoundException, IOException {
		Mockito.when(dataBaseClass.getStringFromDataBase()).thenReturn("Hello"); // Define el comportamiento del mock object
		Mockito.when(networkClass.getStringFromRemoteServer()).thenReturn("World"); // Define el comportamiento del mock object

		// No se instancia la clase bajo test. Mockito lo hace.
		someComplexClass.concatStringsFromDataBaseAndNetworkAndOutputResult();
		Mockito.verify(outputClass).printOutput("Hello - World");
	}
}
