package Entidades;

import java.util.LinkedList;

public class familia {
	
	private String nombre;
	private LinkedList<Persona> intgrantesFamilia;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LinkedList<Persona> getIntgrantesFamilia() {
		return intgrantesFamilia;
	}
	public void setIntgrantesFamilia(LinkedList<Persona> intgrantesFamilia) {
		this.intgrantesFamilia = intgrantesFamilia;
	}
	public familia(String nombre, LinkedList<Persona> intgrantesFamilia) {
		super();
		this.nombre = nombre;
		this.intgrantesFamilia = intgrantesFamilia;
	}
	public familia() {
		super();
	}
	@Override
	public String toString() {
		return "familia [nombre=" + nombre + ", intgrantesFamilia=" + intgrantesFamilia + "]";
	}
	
	

}
