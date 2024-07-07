package gbo.behaviour.observer.canonical;

public class ObserverImpl implements Observer {

	private static int sequenceId = 0;
	private int id;

	public ObserverImpl() {
		sequenceId++;
		id = sequenceId;
		System.out.println("...Constructor::" + this + "()...");
	}

	@Override
	public void update() {
		System.out.println("..." + this + ".update()...");
	}

	@Override
	public String toString() {
		return "ObserverImpl{id=" + id + "}";
	}

}
