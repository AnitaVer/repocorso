package it.sopra.com;

import java.util.Date;

public class Persona {
	
	private String nome;
	private String cognome;
	private Date dataDiNascita;
	private Indirizzo indirizzo;
	
	public Persona(String nome, String cognome, Date dataDiNascita, Indirizzo indirizzo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.indirizzo = indirizzo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita + ", indirizzo="
				+ indirizzo + "]";
	}
	
	

}
