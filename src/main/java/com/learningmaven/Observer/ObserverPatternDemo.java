package com.learningmaven.Observer;

public class ObserverPatternDemo {

    public static final void run() {
        MessageFeedObservable observable = new MessageFeedObservable();

        IObserver obs1 = new MessageFeedObserver(observable, "Obs1");
        IObserver obs2 = new MessageFeedObserver(observable, "Obs2");

        observable.register(obs1);
        observable.register(obs2);

        observable.setMessage("hi");
    }

    public void idea() {
        /*
            The idea of the Observer Pattern is to enable pushing of updates (state changes) from the
            Observable [1] to Subscriber(s) [0..*] instead of allowing Subscribers to perform polling.

            Whenever there is a change of state (e.g data updated or received) the Observable will notify
            its registered Subscribers of the change of state. The Subscribers can then use this information
            and make do with the updated state.

         */
    }
}
