package gestionnaire_Notes;

public class Matiere {
	
	private String libelle;

	
	public Matiere(String libelle) {
		super();
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Matiere [libelle=" + libelle + "]";
	}

	


}
