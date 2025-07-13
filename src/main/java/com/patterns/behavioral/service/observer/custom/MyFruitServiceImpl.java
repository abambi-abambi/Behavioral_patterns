package com.patterns.behavioral.service.observer.custom;

import com.patterns.behavioral.domain.observer.Fruit;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class MyFruitServiceImpl implements MyFruitService, Observable {

    private final List<Observer<Fruit>> observers;

    @Override
    public void add(Fruit fruit) {
        log.info("Adding {} fruit to storage", fruit);
        // TODO some very useful code
        notifyObservers(fruit);
    }

    @Override
    public List<Observer<Fruit>> getObservers() {
        return observers;
    }
}
