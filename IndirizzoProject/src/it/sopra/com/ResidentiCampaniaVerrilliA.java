package it.sopra.com;

import java.util.ArrayList;
import java.util.List;

public class ResidentiCampaniaVerrilliA {
	
	public static List<Persona> listaResidentiCampania(List<Persona> persone) {
		List<Persona> tmp = new ArrayList<>();
		for(Persona p: persone) {
			if (p.getIndirizzo().getRegione().equalsIgnoreCase("campania")) {
				tmp.add(p);
			}
		}
		return tmp;
	}

}
