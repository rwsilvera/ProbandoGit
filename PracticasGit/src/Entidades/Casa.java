package Entidades;

public class Casa {
	
	private String direccion;
	private String telefono;
	private Familia familia;
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Familia getFamilia() {
		return familia;
	}
	public void setFamilia(Familia familia) {
		this.familia = familia;
	}
	public Casa(String direccion, String telefono, Entidades.Familia familia) {
		super();
		this.direccion = direccion;
		this.telefono = telefono;
		this.familia = familia;
	}
	public Casa() {
		super();
	}
	
	
}
