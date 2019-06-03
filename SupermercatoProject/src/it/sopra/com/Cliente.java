package it.sopra.com;

public class Cliente {
	
	private String codiceFidelity;
	private String nome;
	private String cognome;
	private int punti;
	public Cliente(String codiceFidelity, String nome, String cognome, int punti) {
		super();
		this.codiceFidelity = codiceFidelity;
		this.nome = nome;
		this.cognome = cognome;
		this.punti = punti;
	}
	public String getCodiceFidelity() {
		return codiceFidelity;
	}
	public void setCodiceFidelity(String codiceFidelity) {
		this.codiceFidelity = codiceFidelity;
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
	public int getPunti() {
		return punti;
	}
	public void setPunti(int punti) {
		this.punti = punti;
	}
	@Override
	public String toString() {
		return "Cliente [codiceFidelity=" + codiceFidelity + ", nome=" + nome + ", cognome=" + cognome + ", punti="
				+ punti + "]";
	}
	
	

}
