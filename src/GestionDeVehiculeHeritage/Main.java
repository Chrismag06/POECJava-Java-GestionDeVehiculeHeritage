package GestionDeVehiculeHeritage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String marque;
		String modele; 
		int annee;
				
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Entrez une marque ");
		marque = myObj.next();
		
		System.out.println("Entrez un modèle ");
		modele = myObj.next();
		
		System.out.println("Entrez une année ");
		annee = myObj.nextInt();
		
		Voiture voiture = new Voiture(marque, modele, annee);
		
		voiture.afficherEtat();
		
		voiture.demarrer();
		
		voiture.afficherEtat();
		
		System.out.println("Entrez une vitesse accélération ");
		voiture.accelerer(myObj.nextInt());
		
		voiture.afficherEtat();
		
		System.out.println("Entrez une vitesse freinage ");
		voiture.freiner(myObj.nextInt());
		
		voiture.afficherEtat();
		
		myObj.close();
	}

}
