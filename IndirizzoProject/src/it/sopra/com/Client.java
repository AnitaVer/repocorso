package it.sopra.com;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona francesca = new Persona("Francesca", "Verrilli", new Date("19/08/1988"), new Indirizzo("Croci", 2, "Cf", "82022", "BN", "Campania"));
		System.out.println(francesca.toString());
	}

}
