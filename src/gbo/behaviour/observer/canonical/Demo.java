package gbo.behaviour.observer.canonical;

/**
 * Le pattern Observer est utile dans des situations où des objets doivent être
 * informés des changements d'état d'un autre objet sans créer une dépendance
 * forte entre eux. Pour aller plus loin : étudier les raisons de la
 * dépréciation des classes <code>java.util.observer</code> et
 * <code>java.util.observable</code> ainsi que le nouveau modèle proposé avec
 * <code>java.util.concurrent.Flow</code>
 * 
 * @author gbouget
 */
public class Demo {
	public static void main(String[] args) {
		System.out.println("-- com.behaviour.observer.canonique --");
		System.out.println("Instanciation du sujet");
		final Subject sujet = new SubjectImpl();

		System.out.println("Instanciation de trois observateurs");
		final Observer observateur01 = new ObserverImpl();
		final Observer observateur02 = new ObserverImpl();
		final Observer observateur03 = new ObserverImpl();

		System.out.println("Ajout des observateurs dans la collection du sujet (abonnement)");
		sujet.addObserver(observateur01);
		sujet.addObserver(observateur02);
		sujet.addObserver(observateur03);

		System.out.println("Envoi d'un signal (message) du sujet aux observateurs");
		sujet.notifyObservers();

		System.out.println("Suppression de l'observateur 2 de la collection du sujet");
		sujet.removeObserver(observateur02);

		System.out.println("Envoi d'un signal du sujet aux observateurs");
		sujet.notifyObservers();

		System.out.println("Suppression de l'observateur 3");
		sujet.removeObserver(observateur03);

		System.out.println("Envoi d'un signal du sujet aux observateurs");
		sujet.notifyObservers();

		System.out.println("Création de l'observateur 4");
		final Observer observateur04 = new ObserverImpl();

		System.out.println("Envoi d'un signal du sujet aux observateurs");
		sujet.notifyObservers();

		System.out.println("Ajout de l'observateur 2 et 4 dans la liste d'abonnements du sujet");
		sujet.addObserver(observateur02);
		sujet.addObserver(observateur04);

		System.out.println("Envoi d'un signal du sujet aux observateurs");
		sujet.notifyObservers();
	}
}