package com.patterns.behavioral.service.observer.custom;

import lombok.NonNull;

import java.util.List;

public interface Observable<T> {

    @NonNull
    List<Observer<T>> getObservers();

    default void notifyObservers(T object) {
        getObservers().forEach(observer -> observer.update(object));
    }

}
