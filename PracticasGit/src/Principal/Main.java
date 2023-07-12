package Principal;

import java.time.LocalDate;

import Entidades.Departamento;
import Entidades.Persona;

public class Main {

	public static void main(String[] args) {
	//Date fechaNac = new Date(90,7,27);

	//	Persona personaRodolfo = new Persona("Rodolfo", "Silvera", fechaNac, Departamento.LAVALLEJA);
		
		Persona personaRodolfo = new Persona("Rodolfo", "Silvera", LocalDate.of(1990, 8, 27), Departamento.LAVALLEJA);
		
		
		
		System.out.println("Saludamos a "+personaRodolfo.getNombre());

	}

}
