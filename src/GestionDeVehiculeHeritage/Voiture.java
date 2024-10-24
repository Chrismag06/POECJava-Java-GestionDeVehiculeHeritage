package GestionDeVehiculeHeritage;

public class Voiture extends Vehicule{
	
	private int vitesse;
	
	public Voiture(String marque, String modele,int annee){
		super(marque, marque, annee);
		vitesse = 0;
	}
	
	private void afficheVitesse() {
		System.out.println("La vitesse est : " + vitesse);
	}
	
	void accelerer(int vitesseAcceleration) {
		//Augmente la vitesse actuelle de la voiture.
		vitesse += vitesseAcceleration;
		System.out.println("Accélération " + vitesseAcceleration);
		afficheVitesse();
	}
	
	void freiner(int vitesseFreinage) {
		//Réduit la vitesse actuelle
		if (vitesse > vitesseFreinage) {
			vitesse -= vitesseFreinage;
		}else {
			
		}
		
		System.out.println("Freinage " + vitesseFreinage);
		afficheVitesse();
	}


}
