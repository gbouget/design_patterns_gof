package gbo.behaviour.observer.canonical;

import java.util.ArrayList;
import java.util.List;

public class SujetImpl implements Sujet {
	private List<Observateur> observateurs;
	private static int sequenceId = 0;
	private int id;
	
	public SujetImpl() {
		sequenceId++;
		id = sequenceId;
		System.out.println("...Constructor::SujetImpl#"+id+"...");
		observateurs = new ArrayList<Observateur>();
	}

	@Override
	public void ajouterObservateur(final Observateur observateur) {
		System.out.println("...SujetImpl#"+id+".ajouterObservateur#"+observateur.getId()+"()...");
		this.observateurs.add(observateur);
	}

	@Override
	public void supprimerObservateur(final Observateur observateur) {
		System.out.println("...SujetImpl#"+id+".supprimerObservateur#"+observateur.getId()+"()...");
		this.observateurs.remove(this.observateurs.indexOf(observateur));
	}

	@Override
	public void notifier() {
		System.out.println("...SujetImpl#"+id+".notifier()");
		for (final Observateur observateur : observateurs) {
			observateur.appeler();
		}
	}
}
