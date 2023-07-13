package Principal;

import java.time.LocalDate;
import java.util.LinkedList;

import Entidades.Animales;
import Entidades.Casa;
import Entidades.Departamento;
import Entidades.Familia;
import Entidades.Persona;
import Entidades.TipoAnimal;

public class Main {

	public static void main(String[] args) {
	//Date fechaNac = new Date(90,7,27);

	//	Persona personaRodolfo = new Persona("Rodolfo", "Silvera", fechaNac, Departamento.LAVALLEJA);
		
		Persona personaRodolfo = new Persona("Rodolfo", "Silvera", LocalDate.of(1990, 8, 27), Departamento.LAVALLEJA);
		
		Persona	personaBettina = new Persona("Bettina", "Guerra", LocalDate.of(1984, 1, 9), Departamento.LAVALLEJA);
		
		Persona personaBelen = new Persona("Belen", "Bermolen", LocalDate.of(2013, 12, 23), Departamento.LAVALLEJA);
		
		
		LinkedList<Persona>losLocos = new LinkedList<>();
		
		losLocos.add(personaRodolfo);
		losLocos.add(personaBettina);
		losLocos.add(personaBelen);
		
		Familia familiaDeLocos = new Familia("Familia de Locos", losLocos);
		
		Animales agusto = new Animales("Agusto", TipoAnimal.PERRO, personaBettina);
		Animales lucas = new Animales("Lucas", TipoAnimal.PERRO, personaBelen);
		Animales luci = new Animales("Luci", TipoAnimal.PERRO, personaRodolfo);
		Animales manchita = new Animales("Manchita", TipoAnimal.GATO, personaBelen);
		Animales conecone = new Animales("Cone Cone",TipoAnimal.CONEJO, personaBelen);
		
		
		Casa casaFito = new Casa("Ariel 633", "44424528",familiaDeLocos);
		
		
	
		
		
		
	}

}
