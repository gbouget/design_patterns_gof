package com.behaviour.visitor.canonical;

public class VisitableImplB implements Visitable {
	
	
	public VisitableImplB() {
		System.out.println("...Constructeur::VisitableImplB#"+getClass().hashCode()+"()...");
	}

	@Override
	public void accepter(final Visitor visiteur) {
		System.out.println("...VisitableImplB#"+getClass().hashCode()+".accepter(Visitor#"+visiteur.getClass().hashCode()+")...");
		visiteur.visiter(this);
	}

}
