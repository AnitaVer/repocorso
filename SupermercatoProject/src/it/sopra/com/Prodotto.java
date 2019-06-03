package it.sopra.com;

public class Prodotto {
	
	private String code;
	private String descrizione;
	private double costo;
	private int punti;
	
	public Prodotto(String code, String descrizione, double costo, int punti) {
		super();
		this.code = code;
		this.descrizione = descrizione;
		this.costo = costo;
		this.punti = punti;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getPunti() {
		return punti;
	}

	public void setPunti(int punti) {
		this.punti = punti;
	}

	@Override
	public String toString() {
		return "Prodotto [code=" + code + ", descrizione=" + descrizione + ", costo=" + costo + ", punti=" + punti
				+ "]";
	}
	
	

}
