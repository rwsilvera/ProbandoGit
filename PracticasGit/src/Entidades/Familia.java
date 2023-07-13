package Entidades;

import java.util.LinkedList;

public class Familia {
	
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
	public Familia(String nombre, LinkedList<Persona> intgrantesFamilia) {
		super();
		this.nombre = nombre;
		this.intgrantesFamilia = intgrantesFamilia;
	}
	public Familia() {
		super();
	}
	@Override
	public String toString() {
		return "familia [nombre=" + nombre + ", intgrantesFamilia=" + intgrantesFamilia + "]";
	}
	
	

}
