package gbo.behaviour.observer.canonical;

// Subject or Observer
/**
 * Interface à implémenter pour envoyer des notifications à une collection
 * d'observateurs.
 */
public interface Subject {

	/**
	 * 
	 * @param observateur
	 */
	public void addObserver(final Observer observateur);

	/**
	 * 
	 * @param observateur
	 */
	public void removeObserver(final Observer observateur);

	/**
	 * 
	 */
	public void notifyObservers();
}
