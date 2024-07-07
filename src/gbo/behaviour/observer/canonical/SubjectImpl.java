package gbo.behaviour.observer.canonical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * L'implémentation de l'interface Subject contraint cette classe à préciser la
 * manière dont elles informent ses observateurs en se basant uniquement sur
 * l'interface éponyme.
 */
public class SubjectImpl implements Subject {

	/**
	 * Séquence d'identifiants en mémoire, partagée entre toutes les instances de
	 * cette classe. Chaque instance de SubjectImpl se voit attribuer un identifiant
	 * unique en incrémentant cette variable.
	 */
	private static int sequenceId = 0;

	/**
	 * Identifiant de l'instance.
	 */
	private int id;

	/**
	 * <code>Observer</code> permet au <code>Subject</code> de se coupler uniquement
	 * à l'interface et non à ses implémentations.
	 */
	private List<Observer> observateurs; // java.util.List est choisie arbitrairement.

	public SubjectImpl() {
		synchronized (SubjectImpl.class) {
			sequenceId++;
			id = sequenceId;
		}
		System.out.println("...Constructor::" + this + "...");
		observateurs = Collections.synchronizedList(new ArrayList<>());
	}

	@Override
	public void addObserver(final Observer observateur) {
		System.out.println("..." + this + ".addObserver#" + observateur + "()...");
		this.observateurs.add(observateur);
	}

	@Override
	public void removeObserver(final Observer observateur) {
		System.out.println("..." + this + ".removeObserver#" + observateur + "()...");
		this.observateurs.remove(this.observateurs.indexOf(observateur));
	}

	@Override
	public void notifyObservers() {
		System.out.println("..." + this + ".notifyObservers()");
		for (final Observer observateur : observateurs) {
			observateur.update();
		}
	}

	public String toString() {
		return "SubjectImpl{id=" + id + "}";
	}
}
