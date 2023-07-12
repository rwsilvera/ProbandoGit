package Entidades;

public class Animales {
	
	private String nombre;
	private TipoAnimal tipoDeMascota;
	private Persona dueno;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public TipoAnimal getTipoDeMascota() {
		return tipoDeMascota;
	}
	public void setTipoDeMascota(TipoAnimal tipoDeMascota) {
		this.tipoDeMascota = tipoDeMascota;
	}
	public Persona getDueno() {
		return dueno;
	}
	public void setDueno(Persona dueno) {
		this.dueno = dueno;
	}
	public Animales(String nombre, TipoAnimal tipoDeMascota, Persona dueno) {
		super();
		this.nombre = nombre;
		this.tipoDeMascota = tipoDeMascota;
		this.dueno = dueno;
	}
	@Override
	public String toString() {
		return "Animales [nombre=" + nombre + ", tipoDeMascota=" + tipoDeMascota + ", dueno=" + dueno + "]";
	}
	

}
