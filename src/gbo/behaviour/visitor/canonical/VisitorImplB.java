package gbo.behaviour.visitor.canonical;

public class VisitorImplB implements Visitor {
	
	public VisitorImplB() {
		System.out.println("...Constructeur::VisitorImplB#"+getClass().hashCode()+"()...");
	}

	@Override
	public void visiter(final VisitableImplA visitable) {
		System.out.println("...VisitorImplB#"+getClass().hashCode()+".visiter(VisitableImplA#"+visitable.getClass().hashCode()+")...");
	}

	@Override
	public void visiter(final VisitableImplB visitable) {
		System.out.println("...VisitorImplB#"+getClass().hashCode()+".visiter(VisitableImplB#"+visitable.getClass().hashCode()+")...");
	}

}
