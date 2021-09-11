package com.behaviour.visitor.canonical;

public class VisitorImplA implements Visitor {
	
	public VisitorImplA() {
		System.out.println("...Constructeur::VisitorImplA#"+getClass().hashCode()+"()...");
	}

	@Override
	public void visiter(final VisitableImplA visitable) {
		System.out.println("...VisitorImplA#"+getClass().hashCode()+".visiter(VisitableImplA#"+visitable.getClass().hashCode()+")...");
	}

	@Override
	public void visiter(final VisitableImplB visitable) {
		System.out.println("...VisitorImplA#"+getClass().hashCode()+".visiter(VisitableImplB#"+visitable.getClass().hashCode()+")...");
	}
	

}
