package gbo.behaviour.visitor.canonical;

public class VisitableImplA implements Visitable {
	
	
	public VisitableImplA() {
		System.out.println("...Constructeur::VisitableImplA#"+getClass().hashCode()+"()...");
	}

	@Override
	public void accepter(final Visitor visiteur) {
		System.out.println("...VisitableImplA#"+getClass().hashCode()+".accepter(Visitor#"+visiteur.getClass().hashCode()+")...");
		visiteur.visiter(this);
	}
	
}
