package it.sopra.com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona anita = new Persona("anita", "verrilli", new Date("20/02/1990"), new Indirizzo("croci", 4, "castelf", "82022", "Benevento", "Campania"));
		System.out.println(anita.toString());
		
		ArrayList<String> formazioneAnita = new ArrayList<String>();
		formazioneAnita.add("uiip");
		Studente anitaStudente = new Studente(anita, 2, "ing", formazioneAnita);

		Persona francesca = new Persona("Francesca", "Verrilli", new Date("19/08/1988"), new Indirizzo("Croci", 2, "Cf", "82022", "BN", "Campania"));
		System.out.println(francesca.toString());

	}

}
