package com.behaviour.observer.canonical;

/**
 * @author Ga�tan Bouget
 * @implNote a complexit� de design pattern peut se jouer sur les �l�ments suivants :
 * En pratique, l'impl�mentation du deign peut 
 * <ul>
 * <li>Choix de la structure de donn�es (type) pour stocker la collection des observateurs
 * <li>Complexification des r�gles pour notifier les observateurs (ordre d'appel, appel ou non, filtrage ou personnalisation des donn�es, etc.)
 * <li>Transfert des donn�es entre le sujet et les observateurs (envoyer toutes les informations en une fois, faire un premier appel puis laisser la main aux observateurs pour tirer certaines donn�es du sujet)
 * </ul>
 */
public class Demo {
	public static void main(String[] args) {
		System.out.println("-- com.behaviour.observer.canonique --");
		System.out.println("Instanciation du sujet");
		final Sujet sujet = new SujetImpl();
		
		System.out.println("Instanciation de trois observateurs");
		final Observateur observateur01 = new ObservateurImpl();
		final Observateur observateur02 = new ObservateurImpl();
		final Observateur observateur03 = new ObservateurImpl();
		
		System.out.println("Ajout des observateurs dans la collection du sujet (abonnement)");
		sujet.ajouterObservateur(observateur01);
		sujet.ajouterObservateur(observateur02);
		sujet.ajouterObservateur(observateur03);
		
		System.out.println("Envoi d'un signal du sujet aux observateurs");
		sujet.notifier();
		
		System.out.println("Suppression de l'observateur 2 de la collection du sujet");
		sujet.supprimerObservateur(observateur02);
		
		System.out.println("Envoi d'un signal du sujet aux observateurs");
		sujet.notifier();
		
		System.out.println("Suppression de l'observateur 3");
		sujet.supprimerObservateur(observateur03);
		
		System.out.println("Envoi d'un signal du sujet aux observateurs");
		sujet.notifier();
		
		System.out.println("Cr�ation de l'observateur 4");
		final Observateur observateur04 = new ObservateurImpl();
		
		System.out.println("Envoi d'un signal du sujet aux observateurs");
		sujet.notifier();
		
		System.out.println("Ajout de l'observateur 2 et 4 dans la liste d'abonnements du sujet");
		sujet.ajouterObservateur(observateur02);
		sujet.ajouterObservateur(observateur04);
		
		System.out.println("Envoi d'un signal du sujet aux observateurs");
		sujet.notifier();
	}
}