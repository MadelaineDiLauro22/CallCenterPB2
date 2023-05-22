package ar.edu.unlam.pb2.CallCenterTest;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.pb2.CallCenter.CallCenter;
import ar.edu.unlam.pb2.CallCenter.Contacto;
import ar.edu.unlam.pb2.CallCenter.Provincia;
import ar.edu.unlam.pb2.CallCenter.RegistrarLlamada;

public class CallCenterTest {

	@Test
	public void seAgregoConExitoElContacto() {
		CallCenter callcenter = new CallCenter();
		String nombre = "Madelaine";
		String apellido = "DiLauro";
		String celular = "+54-11-5581-5670";
		String email = "madeludmila@outlook.com";
		String direccion = "Calle Falsa 1234";
		Integer codigoPostal = 1744;
		String localidad = "Moreno";
		Provincia provincia = Provincia.BUENOSAIRES;
		Boolean esClienteONo = false;
		Boolean seDebeLlamarONo = true;
		Contacto nuevoContacto = new Contacto(nombre, apellido, celular, email, direccion, codigoPostal, localidad,
				provincia, esClienteONo, seDebeLlamarONo);
		Contacto valorEsperado = nuevoContacto;
		Contacto valorObtenido = callcenter.agregarContacto(nuevoContacto);
		Assert.assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void seAgregoConExitoLaZonaDeCobertura() {
		Integer codigoPostal = null;
		CallCenter callcenter = new CallCenter();
		Integer valorEsperado = callcenter.agregarZonaCobertura(codigoPostal);
		;
		Assert.assertEquals(codigoPostal, valorEsperado);

	}

	@Test
	public void buscarAlCandidatoQueCumplaConLosCriteriosSolicitados() {
		// Test para comprobar que se encuentra un candidato que cumple con los
		// criterios de búsqueda.
		// Implementar el código de la prueba aquí
		CallCenter callcenter = new CallCenter();
		Contacto candidatoEsperadoConTodosLosRequisitos = null;
		Contacto candidatoObtenido = callcenter.buscarAlCandidato();
		Assert.assertEquals(candidatoEsperadoConTodosLosRequisitos, candidatoObtenido);
	}

	@Test
	public void testRegistrarLlamadaActualizaEsClienteExitosa() {
		String nombre = "Madelaine";
		String apellido = "DiLauro";
		String celular = "+54-11-5581-5670";
		String email = "madeludmila@outlook.com";
		String direccion = "Calle Falsa 1234";
		Integer codigoPostal = 1744;
		String localidad = "Moreno";
		Provincia provincia = Provincia.BUENOSAIRES;
		Boolean esClienteONo = false;
		Boolean seDebeLlamarONo = true;
		Contacto contacto = new Contacto(nombre, apellido, celular, email, direccion, codigoPostal, localidad,
				provincia, esClienteONo, seDebeLlamarONo);
		Boolean exitosa = true;
		Boolean llamarNuevamente = false;
		String observaciones = "Llamada exitosa";
		RegistrarLlamada registrarLlamada = new RegistrarLlamada();

		// Act
		registrarLlamada.registrarLlamada(contacto, exitosa, llamarNuevamente, observaciones);

		// Assert
		Assert.assertTrue(contacto.esClienteONo());
	}

	@Test
	public void testRegistrarLlamadaActualizaSeDebeLlamarONo() {
		String nombre = "Madelaine";
		String apellido = "DiLauro";
		String celular = "+54-11-5581-5670";
		String email = "madeludmila@outlook.com";
		String direccion = "Calle Falsa 1234";
		Integer codigoPostal = 1744;
		String localidad = "Moreno";
		Provincia provincia = Provincia.BUENOSAIRES;
		Boolean esClienteONo = false;
		Boolean seDebeLlamarONo = true;
		Contacto contacto = new Contacto(nombre, apellido, celular, email, direccion, codigoPostal, localidad,
				provincia, esClienteONo, seDebeLlamarONo);
		Boolean exitosa = false;
		Boolean llamarNuevamente = true;
		String observaciones = "Llamar nuevamente";
		RegistrarLlamada registrarLlamada = new RegistrarLlamada();

		// Act
		registrarLlamada.registrarLlamada(contacto, exitosa, llamarNuevamente, observaciones);

		// Assert
		Assert.assertTrue(contacto.getSeDebeLlamarONo());
	}

	 public void testRegistrarLlamadaActualizaObservaciones() {
			String nombre = "Madelaine";
			String apellido = "DiLauro";
			String celular = "+54-11-5581-5670";
			String email = "madeludmila@outlook.com";
			String direccion = "Calle Falsa 1234";
			Integer codigoPostal = 1744;
			String localidad = "Moreno";
			Provincia provincia = Provincia.BUENOSAIRES;
			Boolean esClienteONo = true;
			Boolean seDebeLlamarONo = false;
	        // Arrange
			Contacto contacto = new Contacto(
					nombre, apellido, celular, email, direccion, codigoPostal, localidad, provincia, esClienteONo, seDebeLlamarONo);
	        Boolean exitosa = true;
	        Boolean llamarNuevamente = false;
	        String observaciones = "Llamada exitosa";
	        RegistrarLlamada registrarLlamada = new RegistrarLlamada();

	        // Act
	        registrarLlamada.registrarLlamada(contacto, exitosa, llamarNuevamente, observaciones);

	        // Assert
	        Assert.assertEquals(observaciones, contacto.getObservaciones());
	    }

	    @Test
	    public void testRegistrarLlamadaNoActualizaEsClienteSiNoEsExitosa() {
	    	String nombre = "Madelaine";
			String apellido = "DiLauro";
			String celular = "+54-11-5581-5670";
			String email = "madeludmila@outlook.com";
			String direccion = "Calle Falsa 1234";
			Integer codigoPostal = 1744;
			String localidad = "Moreno";
			Provincia provincia = Provincia.BUENOSAIRES;
			Boolean esClienteONo = true;
			Boolean seDebeLlamarONo = false;
	        // Arrange
			Contacto contacto = new Contacto(
					nombre, apellido, celular, email, direccion, codigoPostal, localidad, provincia, esClienteONo, seDebeLlamarONo);
	        Boolean exitosa = false;
	        Boolean llamarNuevamente = true;
	        String observaciones = "Llamada no exitosa";
	        RegistrarLlamada registrarLlamada = new RegistrarLlamada();

	        // Act
	        registrarLlamada.registrarLlamada(contacto, exitosa, llamarNuevamente, observaciones);

	        // Assert
	        Assert.assertFalse(contacto.esClienteONo());
	    }
}
