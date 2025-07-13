package com.patterns.behavioral.service.chainOfResponsibility.validator;

import com.patterns.behavioral.domain.Salad;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(20)
@Slf4j
@Component
public class PotatoIngredientValidatorChain implements ValidatorChain<Salad> {
    @Override
    public void validate(Salad object) {
        log.info("Some validation for potato in ingredients");

//        if (!object.getIngredients().stream().anyMatch(vegetable -> vegetable.getName().matches(".*potato.*"))) {
//            throw new RuntimeException("Error: ingredients should contain potato");
//        }
    }
}
