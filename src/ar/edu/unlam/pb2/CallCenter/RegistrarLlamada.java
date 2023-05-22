package ar.edu.unlam.pb2.CallCenter;

public class RegistrarLlamada {
    
    public void registrarLlamada(Contacto contacto, Boolean exitosa, Boolean llamarNuevamente, String observaciones) {
        contacto.setEsCliente(exitosa);
        contacto.setSeDebeLlamarONo(llamarNuevamente);
        contacto.setObservaciones(observaciones);
    }
    
}

