package ex5;

public class PetitDejeuner {

	private int chambre;
	private int nombreDeRepas;
	private String heure;
	private String commentaires;
	

    public PetitDejeuner(int chambre, int nombreDeRepas, String heure, String commentaires) {
		super();
		this.chambre = chambre;
		this.nombreDeRepas = nombreDeRepas;
		this.heure = heure;
		this.commentaires = commentaires;
	}


	@Override
	public String toString() {
		return "PetitDejeuner [chambre=" + chambre + ", nombreDeRepas=" + nombreDeRepas + ", heure=" + heure
				+ ", commentaires=" + commentaires + "]";
	}


	public int getChambre() {
		return chambre;
	}


	public int getNombreDeRepas() {
		return nombreDeRepas;
	}


	public String getHeure() {
		return heure;
	}


	public String getCommentaires() {
		return commentaires;
	}



	public void setChambre(int chambre) {
		this.chambre = chambre;
	}


	public void setNombreDeRepas(int nombreDeRepas) {
		this.nombreDeRepas = nombreDeRepas;
	}


	public void setHeure(String heure) {
		this.heure = heure;
	}


	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	

	
	
}