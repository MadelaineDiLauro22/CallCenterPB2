package ar.edu.unlam.pb2.CallCenter;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class CallCenter {

	private List<Contacto> contactos;
	private List<Integer> zonasCobertura;

	public CallCenter() {
	        contactos = new ArrayList<>();
	        zonasCobertura = new ArrayList<>();
	    }

	public Contacto agregarContacto(Contacto contacto) {
		contactos.add(contacto);
		return contacto;
	}

	public Integer agregarZonaCobertura(Integer codigoPostal) {
		zonasCobertura.add(codigoPostal);
		return codigoPostal;
	}

	public Contacto buscarAlCandidato() {
		List<Contacto> candidatos = new ArrayList<>();
		for (Contacto contacto : contactos) {
			if (!contacto.esClienteONo() && (contacto.getSeDebeLlamarONo() || !contacto.getSeDebeLlamarONo())) {
				if (zonasCobertura.contains(contacto.getCodigoPostal())) {
					candidatos.add(contacto);
				}
			}
		}

		if (candidatos.isEmpty()) {
			return null;
		}

		Random random = new Random();
		Integer index = random.nextInt(candidatos.size());
		return candidatos.get(index);
	}

	public void registrarLlamada(Contacto contacto, Boolean exitosa, Boolean llamarNuevamente, String observaciones) {
		contacto.setEsCliente(exitosa);
		contacto.setSeDebeLlamarONo(llamarNuevamente);
		contacto.setObservaciones(observaciones);
	}
}
