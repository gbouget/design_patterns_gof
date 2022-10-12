package com.behaviour.strategy.canonical;

/**
 * 
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
