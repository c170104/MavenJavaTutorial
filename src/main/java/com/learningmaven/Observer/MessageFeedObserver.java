package com.learningmaven.Observer;

public class MessageFeedObserver implements IObserver {
    private MessageFeedObservable observable;
    private String obsName;

    public MessageFeedObserver(MessageFeedObservable observable, String obsName) {
        this.observable = observable;
        this.obsName = obsName;
    }

    @Override
    public void update() {
        System.out.println(this.obsName + ": " + this.observable.getMessage());
    }
}