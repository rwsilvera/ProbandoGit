package Entidades;

import java.sql.Date;
import java.util.Calendar;

public class Persona {
	
	private String nombre;
	private String Apellido;
	private Date fechaNacimiento;
	private Departamento departamento;
	private int edad = calcularEdad();
	
	
	

	
	
	

	
public Persona() {
		super();
	}









public Persona(String nombre, String apellido, Date fechaNacimiento, Departamento departamento) {
		super();
		this.nombre = nombre;
		Apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.departamento = departamento;
	}









@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", Apellido=" + Apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", departamento=" + departamento + ", edad=" + edad + "]";
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









	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}









	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}









	public Departamento getDepartamento() {
		return departamento;
	}









	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}









	public int getEdad() {
		return edad;
	}









	public void setEdad(int edad) {
		this.edad = edad;
	}









private int calcularEdad() {
	
	Calendar fechaActual = Calendar.getInstance();
	Calendar fechaNacimiento = Calendar.getInstance();
	fechaNacimiento.setTime(this.fechaNacimiento);
	
	int edad = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
	
	if (fechaActual.get(Calendar.MONTH) < fechaNacimiento.get(Calendar.MONTH) ||
            (fechaActual.get(Calendar.MONTH) == fechaNacimiento.get(Calendar.MONTH) &&
            fechaActual.get(Calendar.DAY_OF_MONTH) < fechaNacimiento.get(Calendar.DAY_OF_MONTH))) {
        edad--;
    }
    
    return edad;


}	

}
