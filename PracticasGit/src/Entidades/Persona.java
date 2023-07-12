package Entidades;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;

public class Persona {
	
	private String nombre;
	private String Apellido;
	private LocalDate fechaNacimiento;
	private Departamento departamento;

	
	
	

	
	
	

	
public Persona() {
		super();
	}









public Persona(String nombre, String apellido, LocalDate fechaNacimiento, Departamento departamento) {
		super();
		this.nombre = nombre;
		Apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.departamento = departamento;
	}









@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", Apellido=" + Apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", departamento=" + departamento + "]";
	}









public String getNombre() {
		return nombre;
	}









	public void setNombre(String nombre) {
		this.nombre = nombre;
	}









	public String getApellido() {
		return Apellido;
	}









	public void setApellido(String apellido) {
		Apellido = apellido;
	}









	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}









	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}









	public Departamento getDepartamento() {
		return departamento;
	}









	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}




























public int calcularEdad() {
	LocalDate fechaActual = LocalDate.now();
    return fechaActual.getYear() - fechaNacimiento.getYear();


}	

public static Persona crearPersona (String nombre, String apellido, LocalDate fechaNacimiento, Departamento departamento) {
	
	Persona p1 = new Persona(nombre, apellido, fechaNacimiento, departamento);
	
	
	return p1;
	
}

}
