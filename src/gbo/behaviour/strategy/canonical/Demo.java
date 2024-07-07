package gbo.behaviour.strategy.canonical;

/**
 * Le pattern stratégie utilise le polymorphisme pour abstraire l'implémentation concrète de l'algorithme.
 * @author gbouget
 *
 */
public class Demo {

    public static void main(String[] args) {
        final AbstractionAlgorithme algo1 = new ConcreteAlgorithme1();
        final AbstractionAlgorithme algo2 = new ConcreteAlgorithme2();
        
        final Client client = new Client(algo1);
        client.doSomething();
        client.setAlgorithme(algo2);
        client.doSomething();
    }

}
