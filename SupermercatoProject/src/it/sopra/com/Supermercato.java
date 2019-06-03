package it.sopra.com;

import java.util.ArrayList;

public class Supermercato {
	
	public static int calcolaPunti(Scontrino scontrino) {
		int puntiTotale = 0;
		
		for(Prodotto p : scontrino.getProdotti()) {
			puntiTotale += p.getPunti();
		}
		
		return puntiTotale;
	}

}
