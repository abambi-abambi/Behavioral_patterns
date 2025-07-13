package com.patterns.behavioral.service.observer.jdk;

import com.patterns.behavioral.domain.observer.Fruit;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service("observerFruitServiceImpl")
@RequiredArgsConstructor
public class FruitServiceImpl extends Observable implements FruitService {

    private final List<Observer> observers;

    @Override
    public void add(Fruit fruit) {
        log.info("Adding {} fruit to storage", fruit);
        // TODO some very useful code
        notifyObservers(fruit);
    }

    @Override
    public void notifyObservers(Object arg) {
        Optional.ofNullable(observers).orElse(new ArrayList<>()).forEach(observer -> observer.update(this, arg));
    }
}
