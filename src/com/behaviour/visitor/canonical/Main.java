package com.behaviour.visitor.canonical;

/**
 * @author Gaëtan Bouget
 * <p>Grâce au polymorphisme, le design pattern Visitor est un bon moyen de respecter le principe open/closed. En contrepartie, la classe Visitor doit implémenter autant de méthodes "visit" que de classes concrètes Visitable.
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Instanciation des visitables");
		final Visitable visitableA = new VisitableImplA();
		final Visitable visitableB = new VisitableImplB();
		
		System.out.println("Instanciation des visitor");
		final Visitor visitorA = new VisitorImplA();
		final Visitor visitorB = new VisitorImplB();
		
		
		System.out.println("Visite A/A");
		visitableA.accepter(visitorA);
		
		System.out.println("Visite A/B");
		visitableA.accepter(visitorB);
		
		System.out.println("Visite B/A");
		visitableB.accepter(visitorA);
		
		System.out.println("Visite B/B");
		visitableB.accepter(visitorB);
		
	}

}
