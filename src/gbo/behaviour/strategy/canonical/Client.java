package gbo.behaviour.strategy.canonical;

/**
 * @implNote
 *
 */
public class Client {
    private AbstractionAlgorithme algorithme;
    
    public Client(AbstractionAlgorithme algorithme) {
        this.algorithme = algorithme;
    }
    
    public void doSomething() {
        algorithme.doSomething();
    }

    public void setAlgorithme(AbstractionAlgorithme algorithme) {
        this.algorithme = algorithme;
    }
    
}
