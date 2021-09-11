package com.behaviour.observer.canonical;

public class ObservateurImpl implements Observateur {
	
	private static int sequenceId = 0;
	private int id;
	
	public ObservateurImpl() {
		sequenceId++;
		id = sequenceId;
		System.out.println("...Constructor::ObservateurImpl#"+id+"()...");
	}

	@Override
	public void appeler() {
		System.out.println("...ObservateurImpl#"+id+".appeler()...");
	}
	
	public int getId() {
		return id;
	}

}
