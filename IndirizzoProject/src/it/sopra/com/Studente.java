package it.sopra.com;

import java.util.ArrayList;
import java.util.Date;

public class Studente extends Persona{
	
	private int livelloLaurea;
	private String titoloStudio;
	private ArrayList<String> corsiFormazione;
	
	public Studente(String nome, String cognome, Date dataDiNascita, Indirizzo indirizzo, int livelloLaurea,
			String titoloStudio, ArrayList<String> corsiFormazione) {
		super(nome, cognome, dataDiNascita, indirizzo);
		this.livelloLaurea = livelloLaurea;
		this.titoloStudio = titoloStudio;
		this.corsiFormazione = corsiFormazione;
	}

	public Studente(String nome, String cognome, Date dataDiNascita, Indirizzo indirizzo) {
		super(nome, cognome, dataDiNascita, indirizzo);
		// TODO Auto-generated constructor stub
	}
	
	public Studente(Persona persona, int livelloLaurea,
			String titoloStudio, ArrayList<String> corsiFormazione) {
		super(persona.getNome(), persona.getCognome(), persona.getDataDiNascita(), persona.getIndirizzo());
		this.livelloLaurea = livelloLaurea;
		this.titoloStudio = titoloStudio;
		this.corsiFormazione = corsiFormazione;
	}

	public int getLivelloLaurea() {
		return livelloLaurea;
	}

	public void setLivelloLaurea(int livelloLaurea) {
		this.livelloLaurea = livelloLaurea;
	}

	public String getTitoloStudio() {
		return titoloStudio;
	}

	public void setTitoloStudio(String titoloStudio) {
		this.titoloStudio = titoloStudio;
	}

	public ArrayList<String> getCorsiFormazione() {
		return corsiFormazione;
	}

	public void setCorsiFormazione(ArrayList<String> corsiFormazione) {
		this.corsiFormazione = corsiFormazione;
	}

	@Override
	public String toString() {
		return "Studente [livelloLaurea=" + livelloLaurea + ", titoloStudio=" + titoloStudio + ", corsiFormazione="
				+ corsiFormazione + "]";
	}

	
	

}
