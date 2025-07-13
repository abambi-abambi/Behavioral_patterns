package com.patterns.behavioral.service.mediator;

import com.patterns.behavioral.domain.chainOfResponsibility.Salad;

public interface SaladServiceMediator {

    Salad createSalad(String saladName, int fruitCount, int vegetableCount);
}
