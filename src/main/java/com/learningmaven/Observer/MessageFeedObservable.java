package com.learningmaven.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MessageFeedObservable implements IObservable {
    private List<IObserver> observersList;
    private String message;
    
    public MessageFeedObservable() {
        this.observersList = new ArrayList<>();
        this.message = "";
    }

    @Override
    public void register(IObserver obs) {
        observersList.add(obs);
    }

    @Override
    public void remove(IObserver obs) {
        observersList.remove(obs);
    }

    @Override
    public void notifyObservers() {
        Iterator<IObserver> it = observersList.iterator();

        while(it.hasNext()) {
            IObserver obs = it.next();
            obs.update();
        }
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String msg) {
        this.message = msg;

        this.notifyObservers();
    }

}