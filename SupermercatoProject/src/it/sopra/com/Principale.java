package it.sopra.com;

import java.util.ArrayList;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente clienteA = new Cliente("codiceA", "Anita", "Verrilli", 10);
		Prodotto prodotto1a = new Prodotto("prodotto1a", "prodotto1a", 10.00, 2);
		Prodotto prodotto2a = new Prodotto("prodotto1b", "prodotto1b", 20.00, 5);
		ArrayList<Prodotto> prodottiA = new ArrayList<>();
		prodottiA.add(prodotto1a);
		prodottiA.add(prodotto2a);
		
		Scontrino scontrinoA = new Scontrino("scontrinoA", clienteA, prodottiA, Supermercato.calcolaImporto(prodottiA));

		Cliente clienteB = new Cliente("codiceB", "Fra", "Verrilli", 10);
		Prodotto prodotto1b = new Prodotto("prodotto1b", "prodotto1b", 50.00, 3);

		
		ArrayList<Cliente> clienti = new ArrayList<>();
		clienti.add(clienteA);
		clienti.add(clienteB);
		
		System.out.println(Supermercato.clientiPiuFedele(clienti));

		ArrayList<Prodotto> prodottiB = new ArrayList<>();
		prodottiB.add(prodotto1b);
		
		Scontrino scontrinoB = new Scontrino("scontrinoB", clienteB, prodottiB, Supermercato.calcolaImporto(prodottiB));

		System.out.println(scontrinoA.toString());
		System.out.println(scontrinoB.toString());
		
		System.out.println(Supermercato.calcolaPunti(scontrinoA));
		System.out.println(Supermercato.calcolaPunti(scontrinoB));

	}

}
