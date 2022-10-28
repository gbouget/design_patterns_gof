package gbo.behaviour.visitor.canonical;

public interface Visitor {
	public void visiter(final VisitableImplA visitable);
	public void visiter(final VisitableImplB visitable);
}
