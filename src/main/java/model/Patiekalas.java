package model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Patiekalas {

	@NotNull
	private int id;
	
	@Pattern(regexp="[A-Za-z0-9 ]+", message="Klaida grupes pavadinime")
	private String grupe;
	
	@Pattern(regexp="[A-Za-z0-9 ]+", message="Klaida patiekalo pavadinime")
	private String pavadinimas;
	
	@Pattern(regexp="[0-9]+", message="Klaidingas kaloriju skaicius")
	private int kalorijos;
	
	@Pattern(regexp="[0-9]+", message="Klaidiniga kaina")
	private double kaina;
	
	public Patiekalas(){}
	
	public Patiekalas(int id, String grupe, String pavadinimas, int kalorijos,
			double kaina) {
		super();
		this.id = id;
		this.grupe = grupe;
		this.pavadinimas = pavadinimas;
		this.kalorijos = kalorijos;
		this.kaina = kaina;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGrupe() {
		return grupe;
	}
	public void setGrupe(String grupe) {
		this.grupe = grupe;
	}
	public String getPavadinimas() {
		return pavadinimas;
	}
	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}
	public int getKalorijos() {
		return kalorijos;
	}
	public void setKalorijos(int kalorijos) {
		this.kalorijos = kalorijos;
	}
	public double getKaina() {
		return kaina;
	}
	public void setKaina(double kaina) {
		this.kaina = kaina;
	}
	
	
}
