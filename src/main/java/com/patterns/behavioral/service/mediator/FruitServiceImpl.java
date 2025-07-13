package com.patterns.behavioral.service.mediator;

import com.patterns.behavioral.domain.mediator.Fruit;
import org.springframework.stereotype.Service;

@Service
public class FruitServiceImpl implements FruitService {
    @Override
    public Fruit get() {
        return new Fruit("apple");
    }
}
