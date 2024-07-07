package gbo.behaviour.observer.canonical;

/**
 * Les observateurs doivent implémenter cette interface pour être notifiés des
 * changements d'état d'un sujet. Lorsqu'un sujet change d'état, il appelle la
 * méthode <code>update</code> de tous ses observateurs pour les informer du
 * changement.
 * <p>
 * Chaque classe qui implémente cette interface doit définir la méthode
 * <code>update</code>, qui sera appelée par le <code>Subject</code> pour
 * notifier l'observateur des changements d'état.
 * 
 */
public interface Observer {
	public void update();
}
