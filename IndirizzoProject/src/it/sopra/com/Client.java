package it.sopra.com;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona anita = new Persona("anita", "verrilli", new Date("20/02/1990"), new Indirizzo("croci", 4, "castelf", "82022", "Benevento", "Campania"));
		System.out.println(anita.toString());

		Persona francesca = new Persona("Francesca", "Verrilli", new Date("19/08/1988"), new Indirizzo("Croci", 2, "Cf", "82022", "BN", "Campania"));
		System.out.println(francesca.toString());

	}

}
