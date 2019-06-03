package it.sopra.com;

import java.util.ArrayList;
import java.util.List;

public class ResidentiCampaniaVerrilliF {
	
	public static List<Persona> listaResidentiCampania(List<Persona> listaPersone) {
		List<Persona> tmp = new ArrayList<>();
		for(Persona persona : listaPersone) {
			if(persona.getIndirizzo().getRegione().equalsIgnoreCase("campania")) {
				tmp.add(persona);
			}
		}
		return tmp;
		
	}

}
