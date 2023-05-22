package ar.edu.unlam.pb2.CallCenter;

public class Contacto {
	private String nombre;
	private String apellido;
	private String celular;
	private String email;
	private String direccion;
	private Integer codigoPostal;
	private String localidad;
	private Provincia provincia;
	private Boolean esClienteONo = false;
	private Boolean seDebeLlamarONo = true;
	public String observaciones;

	

	public Contacto(String nombre, String apellido, String celular, String email, String direccion,
			Integer codigoPostal, String localidad, Provincia provincia, Boolean esClienteONo,
			Boolean seDebeLlamarONo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.email = email;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.provincia = provincia;
		this.esClienteONo = esClienteONo;
		this.seDebeLlamarONo = seDebeLlamarONo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Boolean esClienteONo() {
		return esClienteONo;
	}

	public void setEsCliente(Boolean esClienteONo) {
		this.esClienteONo = esClienteONo;
	}

	public Boolean getSeDebeLlamarONo() {
		return seDebeLlamarONo;
	}

	public void setSeDebeLlamarONo(Boolean seDebeLlamarONo) {
		this.seDebeLlamarONo = seDebeLlamarONo;
	}

	public void setObservaciones(String observaciones) {
		// TODO Auto-generated method stub

	}
	public Boolean getEsClienteONo() {
		return esClienteONo;
	}

	public void setEsClienteONo(Boolean esClienteONo) {
		this.esClienteONo = esClienteONo;
	}

	public String getObservaciones() {
		return observaciones;
	}

}
