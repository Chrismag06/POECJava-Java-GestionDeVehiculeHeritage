package GestionDeVehiculeHeritage;

public class Vehicule {
	
	private String marque;
	private String modele; 
	private int annee;
	private boolean estDemarre;
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public boolean isEstDemarre() {
		return estDemarre;
	}

	public void setEstDemarre(boolean estDemare) {
		this.estDemarre = estDemare;
	}

	public Vehicule(String marque, String modele,int annee){
		this.marque = marque;
		this.modele = modele; 
		this.annee = annee;
	}
		
	void demarrer() {
		//Démarre le vehicule.
		if (!estDemarre) {
			estDemarre = true;
		}else {
			System.out.println("Vehicule déja démaré");
		}
	}
	
	void afficherEtat() {
		//Affiche les informations de la voiture et sa vitesse actuelle.
		System.out.println("\n**********************");
		System.out.println("Marque : " + marque);
		System.out.println("Modèle : " + modele);
		System.out.println("Année : " + annee);
//		System.out.println("Est démarré : " + estDemarre);
		System.out.println("**********************\n");
	}
}
