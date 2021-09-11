package com.behaviour.observer.canonical;

// Subject or Observer
public interface Sujet {
	public void ajouterObservateur(final Observateur observateur);
	public void supprimerObservateur(final Observateur observateur);
	public void notifier();
}
