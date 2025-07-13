package com.patterns.behavioral.service.mediator;

import com.patterns.behavioral.domain.chainOfResponsibility.Vegetable;
import org.springframework.stereotype.Service;

@Service
public class VegetableServiceImpl implements VegetableService {
    @Override
    public Vegetable get() {
        return new Vegetable("potato");
    }
}
