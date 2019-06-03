package it.sopra.com;

/**
 * @author Antonio
 *
 */
public class Indirizzo {
	
	private String via;
	private int civico;
	private String citta;
	private String cap;
	private String provincia;
	private String regione;
	
	public Indirizzo(String via, int civico, String citta, String cap, String provincia, String regione) {
		super();
		this.via = via;
		this.civico = civico;
		this.citta = citta;
		this.cap = cap;
		this.provincia = provincia;
		this.regione = regione;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public int getCivico() {
		return civico;
	}
	public void setCivico(int civico) {
		this.civico = civico;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getRegione() {
		return regione;
	}
	public void setRegione(String regione) {
		this.regione = regione;
	}
	@Override
	public String toString() {
		return "Indirizzo [via=" + via + ", civico=" + civico + ", citta=" + citta + ", cap=" + cap + ", provincia="
				+ provincia + ", regione=" + regione + "]";
	}
	

}
